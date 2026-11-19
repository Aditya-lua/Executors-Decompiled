; std::__ndk1::__num_get<char>::__stage2_int_loop @ 00bde910
00bde910	paciasp
00bde914	stp x29,x30,[sp, #-0x50]!
00bde918	str x25,[sp, #0x10]
00bde91c	stp x24,x23,[sp, #0x20]
00bde920	stp x22,x21,[sp, #0x30]
00bde924	stp x20,x19,[sp, #0x40]
00bde928	mov x29,sp
00bde92c	ldr x20,[x3]
00bde930	ldr x19,[x29, #0x58]
00bde934	and w8,w0,#0xff
00bde938	cmp x20,x2
00bde93c	b.eq 0x00bde990
00bde940	ldrb w9,[x6]
00bde944	ldr x10,[x6, #0x8]
00bde948	and w12,w5,#0xff
00bde94c	lsr x11,x9,#0x1
00bde950	tst w9,#0x1
00bde954	csel x9,x11,x10,eq
00bde958	cmp w8,w12
00bde95c	b.ne 0x00bde9a4
00bde960	cbz x9,0x00bde9a4
00bde964	ldr x8,[x29, #0x50]
00bde968	ldr x9,[x8]
00bde96c	sub x10,x9,x7
00bde970	cmp x10,#0x9f
00bde974	b.gt 0x00bdea38
00bde978	ldr w10,[x4]
00bde97c	mov w0,wzr
00bde980	str w10,[x9], #0x4
00bde984	str x9,[x8]
00bde988	str wzr,[x4]
00bde98c	b 0x00bdea70
00bde990	ldrb w9,[x19, #0x18]
00bde994	cmp w8,w9
00bde998	b.ne 0x00bde9e4
00bde99c	mov w8,#0x2b
00bde9a0	b 0x00bde9f4
00bde9a4	mov w24,w1
00bde9a8	mov x21,x2
00bde9ac	and w1,w0,#0xff
00bde9b0	mov x0,x19
00bde9b4	mov w2,#0x1a
00bde9b8	mov x22,x3
00bde9bc	mov x23,x4
00bde9c0	add x25,x19,#0x1a
00bde9c4	bl 0x00c300a0
00bde9c8	cmp x0,#0x0
00bde9cc	csel x8,x25,x0,eq
00bde9d0	sub x8,x8,x19
00bde9d4	cmp x8,#0x17
00bde9d8	b.le 0x00bdea0c
00bde9dc	mov w0,#0xffffffff
00bde9e0	b 0x00bdea70
00bde9e4	ldrb w9,[x19, #0x19]
00bde9e8	cmp w8,w9
00bde9ec	b.ne 0x00bde940
00bde9f0	mov w8,#0x2d
00bde9f4	add x9,x20,#0x1
00bde9f8	mov w0,wzr
00bde9fc	str x9,[x3]
00bdea00	strb w8,[x20]
00bdea04	str wzr,[x4]
00bdea08	b 0x00bdea70
00bdea0c	cmp w24,#0x8
00bdea10	mov x9,x23
00bdea14	mov x10,x22
00bdea18	b.eq 0x00bdea2c
00bdea1c	cmp w24,#0x10
00bdea20	b.eq 0x00bdea40
00bdea24	cmp w24,#0xa
00bdea28	b.ne 0x00bdea48
00bdea2c	cmp x8,w24, UXTW 
00bdea30	b.ge 0x00bde9dc
00bdea34	b 0x00bdea48
00bdea38	mov w0,wzr
00bdea3c	b 0x00bdea70
00bdea40	cmp x8,#0x16
00bdea44	b.ge 0x00bdea8c
00bdea48	adrp x11,0xcb5000
00bdea4c	mov w0,wzr
00bdea50	ldr x11,[x11, #0xc08]
00bdea54	ldrb w8,[x11, x8]
00bdea58	add x11,x20,#0x1
00bdea5c	str x11,[x10]
00bdea60	strb w8,[x20]
00bdea64	ldr w8,[x9]
00bdea68	add w8,w8,#0x1
00bdea6c	str w8,[x9]
00bdea70	ldp x20,x19,[sp, #0x40]
00bdea74	ldr x25,[sp, #0x10]
00bdea78	ldp x22,x21,[sp, #0x30]
00bdea7c	ldp x24,x23,[sp, #0x20]
00bdea80	ldp x29,x30,[sp], #0x50
00bdea84	autiasp
00bdea88	ret
00bdea8c	subs x11,x20,x21
00bdea90	mov w0,#0xffffffff
00bdea94	b.eq 0x00bdea70
00bdea98	cmp x11,#0x2
00bdea9c	b.gt 0x00bdea70
00bdeaa0	ldurb w11,[x20, #-0x1]
00bdeaa4	cmp w11,#0x30
00bdeaa8	b.ne 0x00bdea70
00bdeaac	adrp x11,0xcb5000
00bdeab0	mov w0,wzr
00bdeab4	ldr x11,[x11, #0xc08]
00bdeab8	str wzr,[x9]
00bdeabc	add x9,x20,#0x1
00bdeac0	ldrb w8,[x11, x8]
00bdeac4	str x9,[x10]
00bdeac8	strb w8,[x20]
00bdeacc	b 0x00bdea70
