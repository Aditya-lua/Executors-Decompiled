; EC_KEY_METHOD_get_keygen @ 00a300f8
00a300f8	cbz x1,0x00a30104
00a300fc	ldr x8,[x0, #0x40]
00a30100	str x8,[x1]
00a30104	ret
