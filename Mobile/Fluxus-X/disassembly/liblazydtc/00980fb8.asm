; ix::ConnectionState::computeId @ 00980fb8
00980fb8	sub sp,sp,#0x50
00980fbc	str x21,[sp, #0x20]
00980fc0	stp x20,x19,[sp, #0x30]
00980fc4	stp x29,x30,[sp, #0x40]
00980fc8	add x29,sp,#0x40
00980fcc	mrs x20,tpidr_el0
00980fd0	ldr x8,[x20, #0x28]
00980fd4	mov x19,x0
00980fd8	str x8,[sp, #0x18]
00980fdc	adrp x8,0xcb4000
00980fe0	ldr x8,[x8, #0xe98]
00980fe4	ldaxr x0,[x8]
00980fe8	add x9,x0,#0x1
00980fec	stlxr w10,x9,[x8]
00980ff0	cbnz w10,0x00980fe4
00980ff4	mov x8,sp
00980ff8	bl 0x00c33410
00980ffc	mov x21,x19
00981000	ldrb w8,[x21, #0x10]!
00981004	tbnz w8,#0x0,0x00981010
00981008	strh wzr,[x21]
0098100c	b 0x00981030
00981010	ldr x8,[x19, #0x20]
00981014	strb wzr,[x8]
00981018	ldrb w8,[x19, #0x10]
0098101c	str xzr,[x19, #0x18]
00981020	tbz w8,#0x0,0x00981030
00981024	ldr x0,[x19, #0x20]
00981028	bl 0x00c301d0
0098102c	str xzr,[x19, #0x10]
00981030	ldr x8,[sp, #0x10]
00981034	str x8,[x21, #0x10]
00981038	ldr q0,[sp]
0098103c	str q0,[x21]
00981040	ldr x8,[x20, #0x28]
00981044	ldr x9,[sp, #0x18]
00981048	cmp x8,x9
0098104c	b.ne 0x00981064
00981050	ldp x29,x30,[sp, #0x40]
00981054	ldp x20,x19,[sp, #0x30]
00981058	ldr x21,[sp, #0x20]
0098105c	add sp,sp,#0x50
00981060	ret
00981064	bl 0x00c2fec0
