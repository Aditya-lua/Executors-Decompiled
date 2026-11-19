; FUN_00aa33c4 @ 00aa33c4
00aa33c4	stp x22,x21,[sp, #-0x30]!
00aa33c8	mov x22,x1
00aa33cc	adrp x1,0x2aa000
00aa33d0	stp x20,x19,[sp, #0x10]
00aa33d4	mov x21,x2
00aa33d8	mov x20,x0
00aa33dc	add x1,x1,#0x4b5
00aa33e0	mov w0,#0x10
00aa33e4	mov w2,#0x2fc
00aa33e8	stp x29,x30,[sp, #0x20]
00aa33ec	add x29,sp,#0x20
00aa33f0	bl 0x00c34250
00aa33f4	cbz x0,0x00aa349c
00aa33f8	ldr x8,[x20]
00aa33fc	mov x19,x0
00aa3400	cbnz x8,0x00aa3410
00aa3404	bl 0x00c34780
00aa3408	str x0,[x20]
00aa340c	cbz x0,0x00aa3464
00aa3410	adrp x1,0x2aa000
00aa3414	add x1,x1,#0x4b5
00aa3418	mov w2,#0x2ff
00aa341c	mov x0,x22
00aa3420	bl 0x00c34600
00aa3424	str x0,[x19]
00aa3428	cbz x0,0x00aa3464
00aa342c	adrp x1,0x2aa000
00aa3430	add x1,x1,#0x4b5
00aa3434	orr w2,wzr,#0x300
00aa3438	mov x0,x21
00aa343c	bl 0x00c34600
00aa3440	str x0,[x19, #0x8]
00aa3444	cbz x0,0x00aa3464
00aa3448	ldr x0,[x20]
00aa344c	mov x1,x19
00aa3450	bl 0x00c347a0
00aa3454	cmp w0,#0x0
00aa3458	b.le 0x00aa3464
00aa345c	mov w0,#0x1
00aa3460	b 0x00aa34d0
00aa3464	ldr x0,[x19]
00aa3468	adrp x20,0x2aa000
00aa346c	add x20,x20,#0x4b5
00aa3470	mov w2,#0x305
00aa3474	mov x1,x20
00aa3478	bl 0x00c32310
00aa347c	ldr x0,[x19, #0x8]
00aa3480	mov w2,#0x306
00aa3484	mov x1,x20
00aa3488	bl 0x00c32310
00aa348c	mov w2,#0x307
00aa3490	mov x0,x19
00aa3494	mov x1,x20
00aa3498	bl 0x00c32310
00aa349c	bl 0x00c342a0
00aa34a0	adrp x0,0x2aa000
00aa34a4	adrp x2,0x2dc000
00aa34a8	add x0,x0,#0x4b5
00aa34ac	add x2,x2,#0x3a5
00aa34b0	mov w1,#0x309
00aa34b4	bl 0x00c342b0
00aa34b8	mov w1,#0x100
00aa34bc	orr w0,wzr,#0xf
00aa34c0	movk w1,#0xc, LSL #16
00aa34c4	mov x2,xzr
00aa34c8	bl 0x00c342c0
00aa34cc	mov w0,wzr
00aa34d0	ldp x29,x30,[sp, #0x20]
00aa34d4	ldp x20,x19,[sp, #0x10]
00aa34d8	ldp x22,x21,[sp], #0x30
00aa34dc	ret
