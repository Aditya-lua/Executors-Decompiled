; ossl_a2ulabel @ 00b002ac
00b002ac	stp x28,x27,[sp, #-0x60]!
00b002b0	stp x26,x25,[sp, #0x10]
00b002b4	stp x24,x23,[sp, #0x20]
00b002b8	stp x22,x21,[sp, #0x30]
00b002bc	stp x20,x19,[sp, #0x40]
00b002c0	stp x29,x30,[sp, #0x50]
00b002c4	add x29,sp,#0x50
00b002c8	sub sp,sp,#0x820
00b002cc	mov x20,x1
00b002d0	mov x24,x0
00b002d4	str x2,[sp]
00b002d8	cbz x1,0x00b002e8
00b002dc	ldr x26,[x2]
00b002e0	mov w21,#0x1
00b002e4	b 0x00b002f0
00b002e8	mov x26,xzr
00b002ec	mov w21,wzr
00b002f0	adrp x22,0x2b1000
00b002f4	mov x28,xzr
00b002f8	add x22,x22,#0x8b6
00b002fc	add x27,sp,#0x18
00b00300	add x19,sp,#0xc
00b00304	mov w1,#0x2e
00b00308	mov x0,x24
00b0030c	bl 0x00c30890
00b00310	mov x23,x0
00b00314	cbz x0,0x00b00320
00b00318	sub x25,x23,x24
00b0031c	b 0x00b0032c
00b00320	mov x0,x24
00b00324	bl 0x00c2ff50
00b00328	mov x25,x0
00b0032c	mov w2,#0x4
00b00330	mov x0,x24
00b00334	mov x1,x22
00b00338	bl 0x00c31bb0
00b0033c	cbz w0,0x00b0038c
00b00340	adds x8,x25,#0x1
00b00344	b.eq 0x00b00380
00b00348	mov x9,xzr
00b0034c	mov x10,xzr
00b00350	add x11,x28,x9
00b00354	cmp x11,x26
00b00358	b.cs 0x00b00368
00b0035c	ldrb w10,[x24, x10]
00b00360	strb w10,[x20], #0x1
00b00364	b 0x00b0036c
00b00368	mov w21,wzr
00b0036c	add x9,x9,#0x1
00b00370	and x10,x9,#0xffffffff
00b00374	cmp x8,x10
00b00378	b.hi 0x00b00350
00b0037c	add x28,x28,x9
00b00380	add x24,x23,#0x1
00b00384	cbnz x23,0x00b00304
00b00388	b 0x00b004f8
00b0038c	mov w8,#0x200
00b00390	add x0,x24,#0x4
00b00394	sub x1,x25,#0x4
00b00398	add x2,sp,#0x18
00b0039c	add x3,sp,#0x14
00b003a0	str w8,[sp, #0x14]
00b003a4	bl 0x00afffe8
00b003a8	cmp w0,#0x1
00b003ac	b.lt 0x00b00504
00b003b0	ldr w8,[sp, #0x14]
00b003b4	cbz w8,0x00b004c4
00b003b8	mov x8,xzr
00b003bc	ldr w9,[x27, x8, LSL #0x2]
00b003c0	cmp w9,#0x7f
00b003c4	b.hi 0x00b003d8
00b003c8	strb w9,[sp, #0xc]
00b003cc	strb wzr,[sp, #0xd]
00b003d0	mov w9,#0x1
00b003d4	b 0x00b0047c
00b003d8	cmp w9,#0x7ff
00b003dc	b.hi 0x00b00404
00b003e0	orr w10,wzr,#0xc0
00b003e4	mov w11,#0x80
00b003e8	bfxil w10,w9,#0x6,#0x5
00b003ec	bfxil w11,w9,#0x0,#0x6
00b003f0	strb w10,[sp, #0xc]
00b003f4	strb w11,[sp, #0xd]
00b003f8	strb wzr,[sp, #0xe]
00b003fc	mov w9,#0x2
00b00400	b 0x00b0047c
00b00404	lsr w10,w9,#0x10
00b00408	cbnz w10,0x00b0043c
00b0040c	orr w10,wzr,#0xe0
00b00410	mov w11,#0x80
00b00414	mov w12,#0x80
00b00418	bfxil w10,w9,#0xc,#0x4
00b0041c	bfxil w11,w9,#0x6,#0x6
00b00420	bfxil w12,w9,#0x0,#0x6
00b00424	strb w10,[sp, #0xc]
00b00428	strb w11,[sp, #0xd]
00b0042c	strb w12,[sp, #0xe]
00b00430	strb wzr,[sp, #0xf]
00b00434	orr w9,wzr,#0x3
00b00438	b 0x00b0047c
00b0043c	cmp w10,#0x10
00b00440	b.hi 0x00b00504
00b00444	orr w10,wzr,#0xf0
00b00448	mov w11,#0x80
00b0044c	mov w12,#0x80
00b00450	mov w13,#0x80
00b00454	bfxil w10,w9,#0x12,#0x3
00b00458	bfxil w11,w9,#0xc,#0x6
00b0045c	bfxil w12,w9,#0x6,#0x6
00b00460	bfxil w13,w9,#0x0,#0x6
00b00464	mov w9,#0x4
00b00468	strb w10,[sp, #0xc]
00b0046c	strb w11,[sp, #0xd]
00b00470	strb w12,[sp, #0xe]
00b00474	strb w13,[sp, #0xf]
00b00478	strb wzr,[sp, #0x10]
00b0047c	mov x10,xzr
00b00480	mov x11,xzr
00b00484	add x12,x28,x10
00b00488	cmp x12,x26
00b0048c	b.cs 0x00b0049c
00b00490	ldrb w11,[x19, x11]
00b00494	strb w11,[x20], #0x1
00b00498	b 0x00b004a0
00b0049c	mov w21,wzr
00b004a0	add x10,x10,#0x1
00b004a4	and x11,x10,#0xffffffff
00b004a8	cmp x9,x11
00b004ac	b.hi 0x00b00484
00b004b0	ldr w9,[sp, #0x14]
00b004b4	add x8,x8,#0x1
00b004b8	add x28,x28,x10
00b004bc	cmp x8,x9
00b004c0	b.cc 0x00b003bc
00b004c4	cmp x28,x26
00b004c8	add x28,x28,#0x1
00b004cc	b.cs 0x00b004ec
00b004d0	cmp x23,#0x0
00b004d4	mov w8,#0x2e
00b004d8	csel w8,w8,wzr,ne
00b004dc	strb w8,[x20], #0x1
00b004e0	add x24,x23,#0x1
00b004e4	cbnz x23,0x00b00304
00b004e8	b 0x00b004f8
00b004ec	mov w21,wzr
00b004f0	add x24,x23,#0x1
00b004f4	cbnz x23,0x00b00304
00b004f8	ldr x8,[sp]
00b004fc	str x28,[x8]
00b00500	b 0x00b00508
00b00504	mov w21,#0xffffffff
00b00508	mov w0,w21
00b0050c	add sp,sp,#0x820
00b00510	ldp x29,x30,[sp, #0x50]
00b00514	ldp x20,x19,[sp, #0x40]
00b00518	ldp x22,x21,[sp, #0x30]
00b0051c	ldp x24,x23,[sp, #0x20]
00b00520	ldp x26,x25,[sp, #0x10]
00b00524	ldp x28,x27,[sp], #0x60
00b00528	ret
