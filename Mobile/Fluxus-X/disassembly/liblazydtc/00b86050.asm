; mbedtls_asn1_write_bitstring @ 00b86050
00b86050	str x23,[sp, #-0x40]!
00b86054	stp x22,x21,[sp, #0x10]
00b86058	stp x20,x19,[sp, #0x20]
00b8605c	stp x29,x30,[sp, #0x30]
00b86060	add x29,sp,#0x30
00b86064	ldr x9,[x0]
00b86068	mov x19,x0
00b8606c	mov x20,x1
00b86070	subs x8,x9,x1
00b86074	b.cc 0x00b861bc
00b86078	add x22,x3,#0x7
00b8607c	lsr x10,x22,#0x3
00b86080	cmp x8,x10
00b86084	b.ls 0x00b861bc
00b86088	and x8,x22,#-0x8
00b8608c	sub x23,x8,x3
00b86090	add x21,x10,#0x1
00b86094	cbz x10,0x00b86108
00b86098	sub x8,x10,#0x1
00b8609c	ldrb w12,[x2, x8]
00b860a0	and x11,x23,#0xffffffff
00b860a4	mov w13,#0xffffffff
00b860a8	lsl w11,w13,w11
00b860ac	sub x14,x9,#0x1
00b860b0	and w11,w12,w11
00b860b4	str x14,[x19]
00b860b8	sturb w11,[x9, #-0x1]
00b860bc	ldr x9,[x19]
00b860c0	mov w11,#0x1
00b860c4	sub x10,x11,x10
00b860c8	mov x1,x2
00b860cc	add x0,x9,x10
00b860d0	mov x2,x8
00b860d4	str x0,[x19]
00b860d8	bl 0x00c2ffd0
00b860dc	ldr x8,[x19]
00b860e0	mov x9,#0xfff7
00b860e4	movk x9,#0xffff, LSL #16
00b860e8	movk x9,#0x7, LSL #32
00b860ec	cmp x22,x9
00b860f0	sub x9,x8,#0x1
00b860f4	str x9,[x19]
00b860f8	sturb w23,[x8, #-0x1]
00b860fc	b.ls 0x00b8611c
00b86100	mov w0,#0xffffff9c
00b86104	b 0x00b861c0
00b86108	sub x8,x9,#0x1
00b8610c	str x8,[x19]
00b86110	sturb w23,[x9, #-0x1]
00b86114	mov w8,#0x1
00b86118	b 0x00b86138
00b8611c	mov w8,#0x1
00b86120	cmp x22,#0x3f8
00b86124	b.cc 0x00b86138
00b86128	mov x9,x21
00b8612c	lsr x9,x9,#0x8
00b86130	add w8,w8,#0x1
00b86134	cbnz x9,0x00b8612c
00b86138	ldr x10,[x19]
00b8613c	sub x9,x10,x20
00b86140	cmp x9,w8, UXTW 
00b86144	b.lt 0x00b861bc
00b86148	sub x11,x10,#0x1
00b8614c	lsr x9,x21,#0x8
00b86150	str x11,[x19]
00b86154	sturb w21,[x10, #-0x1]
00b86158	cbz x9,0x00b86174
00b8615c	ldr x10,[x19]
00b86160	sub x11,x10,#0x1
00b86164	str x11,[x19]
00b86168	sturb w9,[x10, #-0x1]
00b8616c	lsr x9,x9,#0x8
00b86170	cbnz x9,0x00b8615c
00b86174	cmp w8,#0x2
00b86178	b.cc 0x00b86190
00b8617c	ldr x9,[x19]
00b86180	add w10,w8,#0x7f
00b86184	sub x11,x9,#0x1
00b86188	str x11,[x19]
00b8618c	sturb w10,[x9, #-0x1]
00b86190	ldr x9,[x19]
00b86194	sub x10,x9,x20
00b86198	cmp x10,#0x1
00b8619c	b.lt 0x00b861bc
00b861a0	add w8,w21,w8
00b861a4	sub x10,x9,#0x1
00b861a8	orr w11,wzr,#0x3
00b861ac	add w0,w8,#0x1
00b861b0	str x10,[x19]
00b861b4	sturb w11,[x9, #-0x1]
00b861b8	b 0x00b861c0
00b861bc	mov w0,#0xffffff94
00b861c0	ldp x29,x30,[sp, #0x30]
00b861c4	ldp x20,x19,[sp, #0x20]
00b861c8	ldp x22,x21,[sp, #0x10]
00b861cc	ldr x23,[sp], #0x40
00b861d0	ret
