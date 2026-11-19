; conf_ssl_name_find @ 00a11b80
00a11b80	str x23,[sp, #-0x40]!
00a11b84	stp x22,x21,[sp, #0x10]
00a11b88	stp x20,x19,[sp, #0x20]
00a11b8c	stp x29,x30,[sp, #0x30]
00a11b90	add x29,sp,#0x30
00a11b94	cbz x0,0x00a11be8
00a11b98	adrp x8,0xd21000
00a11b9c	ldr x21,[x8, #0x970]
00a11ba0	cbz x21,0x00a11bd8
00a11ba4	adrp x8,0xd21000
00a11ba8	ldr x22,[x8, #0x968]
00a11bac	mov x19,x1
00a11bb0	mov x20,x0
00a11bb4	mov x23,xzr
00a11bb8	ldr x0,[x22]
00a11bbc	mov x1,x20
00a11bc0	bl 0x00c301f0
00a11bc4	cbz w0,0x00a11be0
00a11bc8	add x23,x23,#0x1
00a11bcc	cmp x23,x21
00a11bd0	add x22,x22,#0x18
00a11bd4	b.cc 0x00a11bb8
00a11bd8	mov w0,wzr
00a11bdc	b 0x00a11be8
00a11be0	str x23,[x19]
00a11be4	mov w0,#0x1
00a11be8	ldp x29,x30,[sp, #0x30]
00a11bec	ldp x20,x19,[sp, #0x20]
00a11bf0	ldp x22,x21,[sp, #0x10]
00a11bf4	ldr x23,[sp], #0x40
00a11bf8	ret
