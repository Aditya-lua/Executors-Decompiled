; EC_KEY_decoded_from_explicit_params @ 00a2f774
00a2f774	cbz x0,0x00a2f788
00a2f778	ldr x8,[x0, #0x18]
00a2f77c	cbz x8,0x00a2f790
00a2f780	ldr w0,[x8, #0x28]
00a2f784	ret
00a2f788	mov w0,#0xffffffff
00a2f78c	ret
00a2f790	mov w0,#0xffffffff
00a2f794	ret
