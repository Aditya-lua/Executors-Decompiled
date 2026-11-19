; log_switch_to_syslog @ 008e4dbc
008e4dbc	adrp x8,0xd1f000
008e4dc0	mov w9,#0x1
008e4dc4	strb w9,[x8, #0xee0]
008e4dc8	ret
