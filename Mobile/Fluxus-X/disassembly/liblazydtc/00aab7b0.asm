; CRYPTO_ocb128_setiv @ 00aab7b0
00aab7b0	sub sp,sp,#0x80
00aab7b4	sub x8,x2,#0x1
00aab7b8	stp x20,x19,[sp, #0x60]
00aab7bc	mov x19,x0
00aab7c0	cmp x8,#0xe
00aab7c4	mov w0,#0xffffffff
00aab7c8	stp x22,x21,[sp, #0x50]
00aab7cc	stp x29,x30,[sp, #0x70]
00aab7d0	add x29,sp,#0x70
00aab7d4	b.hi 0x00aab91c
00aab7d8	sub x8,x3,#0x1
00aab7dc	mov x22,x3
00aab7e0	cmp x8,#0xf
00aab7e4	b.hi 0x00aab91c
00aab7e8	mov x20,x2
00aab7ec	mov x21,x1
00aab7f0	add x0,x19,#0x60
00aab7f4	mov w2,#0x50
00aab7f8	mov w1,wzr
00aab7fc	bl 0x00c301c0
00aab800	lsl w8,w22,#0x4
00aab804	mov x22,sp
00aab808	strb w8,[sp]
00aab80c	sub x8,x22,x20
00aab810	add x0,x8,#0x10
00aab814	mov x1,x21
00aab818	mov x2,x20
00aab81c	str xzr,[sp, #0x8]
00aab820	stur xzr,[sp, #0x1]
00aab824	bl 0x00c2ffd0
00aab828	orr w8,wzr,#0xf
00aab82c	sub x8,x8,x20
00aab830	ldrb w9,[x22, x8]
00aab834	add x0,sp,#0x30
00aab838	sub x1,x29,#0x30
00aab83c	orr w9,w9,#0x1
00aab840	strb w9,[x22, x8]
00aab844	ldr q0,[sp]
00aab848	str q0,[sp, #0x30]
00aab84c	ldrb w8,[sp, #0x3f]
00aab850	and w8,w8,#0xc0
00aab854	strb w8,[sp, #0x3f]
00aab858	ldr x8,[x19]
00aab85c	ldr x2,[x19, #0x10]
00aab860	blr x8
00aab864	ldurb w8,[x29, #-0x30]
00aab868	ldurb w9,[x29, #-0x2f]
00aab86c	ldurb w10,[x29, #-0x2e]
00aab870	ldurb w11,[x29, #-0x2d]
00aab874	ldurb w12,[x29, #-0x2c]
00aab878	eor w8,w9,w8
00aab87c	strb w8,[sp, #0x20]
00aab880	ldrb w8,[sp, #0xf]
00aab884	ldurb w13,[x29, #-0x2b]
00aab888	ldurb w14,[x29, #-0x2a]
00aab88c	ldurb w15,[x29, #-0x29]
00aab890	ldurb w16,[x29, #-0x28]
00aab894	ldur q0,[x29, #-0x30]
00aab898	add x20,sp,#0x10
00aab89c	bfxil x20,x8,#0x3,#0x3
00aab8a0	and x21,x8,#0x7
00aab8a4	eor w9,w10,w9
00aab8a8	eor w10,w11,w10
00aab8ac	eor w11,w12,w11
00aab8b0	eor w12,w13,w12
00aab8b4	eor w13,w14,w13
00aab8b8	eor w14,w15,w14
00aab8bc	eor w15,w16,w15
00aab8c0	add x2,x19,#0x90
00aab8c4	mov x0,x20
00aab8c8	mov x1,x21
00aab8cc	str q0,[sp, #0x10]
00aab8d0	strb w9,[sp, #0x21]
00aab8d4	strb w10,[sp, #0x22]
00aab8d8	strb w11,[sp, #0x23]
00aab8dc	strb w12,[sp, #0x24]
00aab8e0	strb w13,[sp, #0x25]
00aab8e4	strb w14,[sp, #0x26]
00aab8e8	strb w15,[sp, #0x27]
00aab8ec	bl 0x00aab930
00aab8f0	ldrb w10,[x20, #0x10]
00aab8f4	mov w8,#0x8
00aab8f8	orr w9,wzr,#0xff
00aab8fc	ldrb w11,[x19, #0x9f]
00aab900	sub w8,w8,w21
00aab904	lsl w9,w9,w8
00aab908	and w9,w9,w10
00aab90c	lsr w8,w9,w8
00aab910	orr w8,w11,w8
00aab914	mov w0,#0x1
00aab918	strb w8,[x19, #0x9f]
00aab91c	ldp x29,x30,[sp, #0x70]
00aab920	ldp x20,x19,[sp, #0x60]
00aab924	ldp x22,x21,[sp, #0x50]
00aab928	add sp,sp,#0x80
00aab92c	ret
