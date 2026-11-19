; tls13_alert_code @ 009c7b0c
009c7b0c	cmp w0,#0x6d
009c7b10	b.eq 0x009c7b1c
009c7b14	cmp w0,#0x74
009c7b18	b.ne 0x009c7b20
009c7b1c	ret
009c7b20	b 0x00c344d0
