; evp_app_cleanup_int @ 00a75aec
00a75aec	adrp x8,0xd21000
00a75af0	ldr x0,[x8, #0xb48]
00a75af4	cbz x0,0x00a75b04
00a75af8	adrp x1,0xcb5000
00a75afc	ldr x1,[x1, #0x5f8]
00a75b00	b 0x00c32600
00a75b04	ret
