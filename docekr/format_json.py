#!/usr/bin/env python
# encoding: utf-8
import json
weather_dict = json.loads(raw_input())
weather_format_json = json.dumps(weather_dict, indent=4, separators=(',', ': '),ensure_ascii=False)
print weather_format_json

