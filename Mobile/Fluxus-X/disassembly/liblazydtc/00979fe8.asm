; std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>::swap @ 00979fe8
00979fe8	sub sp,sp,#0x60
00979fec	str x21,[sp, #0x30]
00979ff0	stp x20,x19,[sp, #0x40]
00979ff4	stp x29,x30,[sp, #0x50]
00979ff8	add x29,sp,#0x50
00979ffc	mrs x21,tpidr_el0
0097a000	ldr x8,[x21, #0x28]
0097a004	mov x19,x1
0097a008	mov x20,x0
0097a00c	cmp x1,x0
0097a010	str x8,[sp, #0x28]
0097a014	b.eq 0x0097a120
0097a018	ldr x0,[x20, #0x20]
0097a01c	cmp x0,x20
0097a020	b.eq 0x0097a03c
0097a024	ldr x8,[x19, #0x20]
0097a028	cmp x19,x8
0097a02c	b.eq 0x0097a074
0097a030	str x8,[x20, #0x20]
0097a034	str x0,[x19, #0x20]
0097a038	b 0x0097a120
0097a03c	ldr x8,[x19, #0x20]
0097a040	cmp x8,x19
0097a044	b.eq 0x0097a0a8
0097a048	ldr x8,[x0]
0097a04c	ldr x8,[x8, #0x18]
0097a050	mov x1,x19
0097a054	blr x8
0097a058	ldr x0,[x20, #0x20]
0097a05c	ldr x8,[x0]
0097a060	ldr x8,[x8, #0x20]
0097a064	blr x8
0097a068	ldr x8,[x19, #0x20]
0097a06c	str x8,[x20, #0x20]
0097a070	b 0x0097a11c
0097a074	ldr x9,[x8]
0097a078	ldr x9,[x9, #0x18]
0097a07c	mov x0,x8
0097a080	mov x1,x20
0097a084	blr x9
0097a088	ldr x0,[x19, #0x20]
0097a08c	ldr x8,[x0]
0097a090	ldr x8,[x8, #0x20]
0097a094	blr x8
0097a098	ldr x8,[x20, #0x20]
0097a09c	str x8,[x19, #0x20]
0097a0a0	str x20,[x20, #0x20]
0097a0a4	b 0x0097a120
0097a0a8	ldr x8,[x0]
0097a0ac	ldr x8,[x8, #0x18]
0097a0b0	mov x1,sp
0097a0b4	blr x8
0097a0b8	ldr x0,[x20, #0x20]
0097a0bc	ldr x8,[x0]
0097a0c0	ldr x8,[x8, #0x20]
0097a0c4	blr x8
0097a0c8	str xzr,[x20, #0x20]
0097a0cc	ldr x0,[x19, #0x20]
0097a0d0	ldr x8,[x0]
0097a0d4	ldr x8,[x8, #0x18]
0097a0d8	mov x1,x20
0097a0dc	blr x8
0097a0e0	ldr x0,[x19, #0x20]
0097a0e4	ldr x8,[x0]
0097a0e8	ldr x8,[x8, #0x20]
0097a0ec	blr x8
0097a0f0	str xzr,[x19, #0x20]
0097a0f4	str x20,[x20, #0x20]
0097a0f8	ldr x8,[sp]
0097a0fc	ldr x8,[x8, #0x18]
0097a100	mov x0,sp
0097a104	mov x1,x19
0097a108	blr x8
0097a10c	ldr x8,[sp]
0097a110	mov x0,sp
0097a114	ldr x8,[x8, #0x20]
0097a118	blr x8
0097a11c	str x19,[x19, #0x20]
0097a120	ldr x8,[x21, #0x28]
0097a124	ldr x9,[sp, #0x28]
0097a128	cmp x8,x9
0097a12c	b.ne 0x0097a144
0097a130	ldp x29,x30,[sp, #0x50]
0097a134	ldp x20,x19,[sp, #0x40]
0097a138	ldr x21,[sp, #0x30]
0097a13c	add sp,sp,#0x60
0097a140	ret
0097a144	bl 0x00c2fec0
