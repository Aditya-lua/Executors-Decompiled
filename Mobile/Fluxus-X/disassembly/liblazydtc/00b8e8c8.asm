; psa_key_derivation_input_key @ 00b8e8c8
00b8e8c8	sub sp,sp,#0x40
00b8e8cc	stp x22,x21,[sp, #0x10]
00b8e8d0	stp x20,x19,[sp, #0x20]
00b8e8d4	stp x29,x30,[sp, #0x30]
00b8e8d8	add x29,sp,#0x30
00b8e8dc	mrs x22,tpidr_el0
00b8e8e0	ldr x9,[x22, #0x28]
00b8e8e4	mov w8,w2
00b8e8e8	mov x19,x0
00b8e8ec	mov w20,w1
00b8e8f0	str x9,[sp, #0x8]
00b8e8f4	ldr w3,[x0]
00b8e8f8	mov x1,sp
00b8e8fc	mov w2,#0x4000
00b8e900	mov w0,w8
00b8e904	bl 0x00b86e5c
00b8e908	mov w21,w0
00b8e90c	cbnz w0,0x00b8e978
00b8e910	ldr x0,[sp]
00b8e914	ldr w8,[x0, #0x4]
00b8e918	cmp w8,#0x100
00b8e91c	b.cs 0x00b8e96c
00b8e920	sub w8,w20,#0x101
00b8e924	and w8,w8,#0xffff
00b8e928	cmp w8,#0x1
00b8e92c	b.hi 0x00b8e93c
00b8e930	ldrb w8,[x19, #0x4]
00b8e934	orr w8,w8,#0x1
00b8e938	strb w8,[x19, #0x4]
00b8e93c	ldp x3,x4,[x0, #0x28]
00b8e940	ldrh w2,[x0]
00b8e944	mov x0,x19
00b8e948	mov w1,w20
00b8e94c	bl 0x00b8e20c
00b8e950	ldr x8,[sp]
00b8e954	mov w19,w0
00b8e958	mov x0,x8
00b8e95c	bl 0x00c431e0
00b8e960	cmp w19,#0x0
00b8e964	csel w21,w0,w19,eq
00b8e968	b 0x00b8e980
00b8e96c	bl 0x00c431e0
00b8e970	mov w21,#0xffffff7a
00b8e974	str xzr,[sp]
00b8e978	mov x0,x19
00b8e97c	bl 0x00c42d20
00b8e980	ldr x8,[x22, #0x28]
00b8e984	ldr x9,[sp, #0x8]
00b8e988	cmp x8,x9
00b8e98c	b.ne 0x00b8e9a8
00b8e990	mov w0,w21
00b8e994	ldp x29,x30,[sp, #0x30]
00b8e998	ldp x20,x19,[sp, #0x20]
00b8e99c	ldp x22,x21,[sp, #0x10]
00b8e9a0	add sp,sp,#0x40
00b8e9a4	ret
00b8e9a8	bl 0x00c2fec0
