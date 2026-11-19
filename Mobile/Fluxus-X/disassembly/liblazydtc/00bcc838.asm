; std::__ndk1::promise<void>::~promise @ 00bcc838
00bcc838	paciasp
00bcc83c	sub sp,sp,#0x60
00bcc840	stp x29,x30,[sp, #0x30]
00bcc844	str x21,[sp, #0x40]
00bcc848	stp x20,x19,[sp, #0x50]
00bcc84c	add x29,sp,#0x30
00bcc850	ldr x19,[x0]
00bcc854	cbz x19,0x00bcc93c
00bcc858	ldrb w8,[x19, #0x70]
00bcc85c	tbnz w8,#0x0,0x00bcc91c
00bcc860	mov x20,x0
00bcc864	ldr x21,[x19, #0x10]
00bcc868	add x0,x29,#0x18
00bcc86c	str xzr,[x29, #0x18]
00bcc870	bl 0x00c31450
00bcc874	ldr x19,[x20]
00bcc878	cbnz x21,0x00bcc91c
00bcc87c	ldr x8,[x19, #0x8]
00bcc880	cmp x8,#0x1
00bcc884	b.lt 0x00bcc91c
00bcc888	adrp x8,0xd26000
00bcc88c	add x8,x8,#0x700
00bcc890	ldarb w8,[x8]
00bcc894	tbz w8,#0x0,0x00bcc954
00bcc898	nop
00bcc89c	adr x2,0xcca5f0
00bcc8a0	add x0,sp,#0x8
00bcc8a4	mov w1,#0x4
00bcc8a8	bl 0x00c43e50
00bcc8ac	mov w0,#0x20
00bcc8b0	bl 0x00c30000
00bcc8b4	adrp x1,0xcb4000
00bcc8b8	nop
00bcc8bc	adr x2,0xbccc04
00bcc8c0	ldr x1,[x1, #0xd20]
00bcc8c4	mov x21,x0
00bcc8c8	bl 0x00c43ec0
00bcc8cc	add x1,sp,#0x8
00bcc8d0	mov x0,x21
00bcc8d4	bl 0x00c31430
00bcc8d8	adrp x8,0xcb4000
00bcc8dc	mov x0,x21
00bcc8e0	ldr x8,[x8, #0xd38]
00bcc8e4	add x8,x8,#0x10
00bcc8e8	str x8,[x21]
00bcc8ec	sub x8,x29,#0x8
00bcc8f0	ldur q0,[sp, #0x18]
00bcc8f4	str q0,[x21, #0x10]
00bcc8f8	bl 0x00c43c50
00bcc8fc	sub x1,x29,#0x8
00bcc900	mov x0,x19
00bcc904	bl 0x00c315d0
00bcc908	sub x0,x29,#0x8
00bcc90c	bl 0x00c31450
00bcc910	add x0,sp,#0x8
00bcc914	bl 0x00c314e0
00bcc918	ldr x19,[x20]
00bcc91c	add x1,x19,#0x8
00bcc920	mov x0,#-0x1
00bcc924	bl 0x00c2bd10
00bcc928	cbnz x0,0x00bcc93c
00bcc92c	ldr x8,[x19]
00bcc930	mov x0,x19
00bcc934	ldr x8,[x8, #0x10]
00bcc938	blr x8
00bcc93c	ldp x20,x19,[sp, #0x50]
00bcc940	ldr x21,[sp, #0x40]
00bcc944	ldp x29,x30,[sp, #0x30]
00bcc948	add sp,sp,#0x60
00bcc94c	autiasp
00bcc950	ret
00bcc954	adrp x0,0xd26000
00bcc958	add x0,x0,#0x700
00bcc95c	bl 0x00c2fe90
00bcc960	cbz w0,0x00bcc898
00bcc964	adrp x0,0xd26000
00bcc968	add x0,x0,#0x700
00bcc96c	bl 0x00c2fea0
00bcc970	b 0x00bcc898
