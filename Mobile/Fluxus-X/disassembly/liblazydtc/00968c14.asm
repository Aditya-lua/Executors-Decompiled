; FUN_00968c14 @ 00968c14
00968c14	ldr x8,[x0]
00968c18	mov w9,#0xa
00968c1c	ldr w8,[x8, #0x8]
00968c20	bics wzr,w9,w8
00968c24	cset w0,eq
00968c28	ret
