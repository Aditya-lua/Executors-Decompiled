; i2v_ASN1_BIT_STRING @ 00afe964
00afe964	sub sp,sp,#0x30
00afe968	stp x20,x19,[sp, #0x10]
00afe96c	stp x29,x30,[sp, #0x20]
00afe970	str x2,[sp, #0x8]
00afe974	ldr x20,[x0, #0x60]
00afe978	add x29,sp,#0x20
00afe97c	ldr x8,[x20, #0x8]
00afe980	cbz x8,0x00afe9b8
00afe984	mov x19,x1
00afe988	ldr w1,[x20]
00afe98c	mov x0,x19
00afe990	bl 0x00c373b0
00afe994	cbz w0,0x00afe9a8
00afe998	ldr x0,[x20, #0x8]
00afe99c	add x2,sp,#0x8
00afe9a0	mov x1,xzr
00afe9a4	bl 0x00c408c0
00afe9a8	ldr x8,[x20, #0x20]
00afe9ac	add x20,x20,#0x18
00afe9b0	cbnz x8,0x00afe988
00afe9b4	ldr x2,[sp, #0x8]
00afe9b8	ldp x29,x30,[sp, #0x20]
00afe9bc	ldp x20,x19,[sp, #0x10]
00afe9c0	mov x0,x2
00afe9c4	add sp,sp,#0x30
00afe9c8	ret
