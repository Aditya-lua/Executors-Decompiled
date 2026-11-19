; ossl_sha1 @ 00adde58
00adde58	sub sp,sp,#0x90
00adde5c	adrp x8,0xd22000
00adde60	str x21,[sp, #0x60]
00adde64	mov x21,x0
00adde68	add x8,x8,#0x234
00adde6c	cmp x2,#0x0
00adde70	mov x0,sp
00adde74	stp x20,x19,[sp, #0x70]
00adde78	stp x29,x30,[sp, #0x80]
00adde7c	add x29,sp,#0x80
00adde80	mov x20,x1
00adde84	csel x19,x8,x2,eq
00adde88	bl 0x00c3d580
00adde8c	cbz w0,0x00addebc
00adde90	mov x0,sp
00adde94	mov x1,x21
00adde98	mov x2,x20
00adde9c	bl 0x00c3d590
00addea0	mov x1,sp
00addea4	mov x0,x19
00addea8	bl 0x00c3d570
00addeac	mov x0,sp
00addeb0	orr w1,wzr,#0x60
00addeb4	bl 0x00c34750
00addeb8	b 0x00addec0
00addebc	mov x19,xzr
00addec0	mov x0,x19
00addec4	ldp x29,x30,[sp, #0x80]
00addec8	ldp x20,x19,[sp, #0x70]
00addecc	ldr x21,[sp, #0x60]
00added0	add sp,sp,#0x90
00added4	ret
