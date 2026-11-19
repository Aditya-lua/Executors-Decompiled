; conf_ssl_get_cmd @ 00a11bfc
00a11bfc	add x8,x0,x1, LSL #0x4
00a11c00	ldr x9,[x8]
00a11c04	str x9,[x2]
00a11c08	ldr x8,[x8, #0x8]
00a11c0c	str x8,[x3]
00a11c10	ret
