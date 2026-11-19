; std::__ndk1::__thread_proxy<std::__ndk1::tuple<std::__ndk1::unique_ptr<std::__ndk1::__thread_struct,std::__ndk1::default_delete<std::__ndk1::__thread_struct>>,void(ix::SocketServer::*)(std::__ndk1::unique_ptr<ix::Socket,std::__ndk1::default_delete<ix::Socket>>,std::__ndk1::shared_ptr<ix::ConnectionState>),ix::SocketServer*,std::__ndk1::unique_ptr<ix::Socket,std::__ndk1::default_delete<ix::Socket>>,std::__ndk1::shared_ptr<ix::ConnectionState>>> @ 0098af78
0098af78	sub sp,sp,#0x50
0098af7c	str x21,[sp, #0x20]
0098af80	stp x20,x19,[sp, #0x30]
0098af84	stp x29,x30,[sp, #0x40]
0098af88	add x29,sp,#0x40
0098af8c	mrs x21,tpidr_el0
0098af90	ldr x8,[x21, #0x28]
0098af94	mov x19,x0
0098af98	str x8,[sp, #0x18]
0098af9c	bl 0x00c30180
0098afa0	ldr x1,[x19]
0098afa4	str xzr,[x19]
0098afa8	ldr w0,[x0]
0098afac	bl 0x00c30190
0098afb0	ldp x11,x10,[x19, #0x10]
0098afb4	ldr x8,[x19, #0x8]
0098afb8	add x9,x19,#0x28
0098afbc	add x0,x10,x11, ASR #0x1
0098afc0	tbz w11,#0x0,0x0098afcc
0098afc4	ldr x10,[x0]
0098afc8	ldr x8,[x10, x8#0x0]
0098afcc	ldr x10,[x19, #0x20]
0098afd0	str xzr,[x19, #0x20]
0098afd4	str x10,[sp, #0x10]
0098afd8	ldur q0,[x19, #0x28]
0098afdc	str q0,[sp]
0098afe0	stp xzr,xzr,[x9]
0098afe4	add x1,sp,#0x10
0098afe8	mov x2,sp
0098afec	blr x8
0098aff0	ldr x20,[sp, #0x8]
0098aff4	cbz x20,0x0098b028
0098aff8	add x8,x20,#0x8
0098affc	ldaxr x9,[x8]
0098b000	sub x10,x9,#0x1
0098b004	stlxr w11,x10,[x8]
0098b008	cbnz w11,0x0098affc
0098b00c	cbnz x9,0x0098b028
0098b010	ldr x8,[x20]
0098b014	mov x0,x20
0098b018	ldr x8,[x8, #0x10]
0098b01c	blr x8
0098b020	mov x0,x20
0098b024	bl 0x00c2ff00
0098b028	ldr x0,[sp, #0x10]
0098b02c	str xzr,[sp, #0x10]
0098b030	cbz x0,0x0098b040
0098b034	ldr x8,[x0]
0098b038	ldr x8,[x8, #0x8]
0098b03c	blr x8
0098b040	ldr x20,[x19, #0x30]
0098b044	cbz x20,0x0098b078
0098b048	add x8,x20,#0x8
0098b04c	ldaxr x9,[x8]
0098b050	sub x10,x9,#0x1
0098b054	stlxr w11,x10,[x8]
0098b058	cbnz w11,0x0098b04c
0098b05c	cbnz x9,0x0098b078
0098b060	ldr x8,[x20]
0098b064	mov x0,x20
0098b068	ldr x8,[x8, #0x10]
0098b06c	blr x8
0098b070	mov x0,x20
0098b074	bl 0x00c2ff00
0098b078	ldr x0,[x19, #0x20]
0098b07c	str xzr,[x19, #0x20]
0098b080	cbz x0,0x0098b090
0098b084	ldr x8,[x0]
0098b088	ldr x8,[x8, #0x8]
0098b08c	blr x8
0098b090	ldr x20,[x19]
0098b094	str xzr,[x19]
0098b098	cbz x20,0x0098b0ac
0098b09c	mov x0,x20
0098b0a0	bl 0x00c301a0
0098b0a4	mov x0,x20
0098b0a8	bl 0x00c301d0
0098b0ac	mov x0,x19
0098b0b0	bl 0x00c301d0
0098b0b4	ldr x8,[x21, #0x28]
0098b0b8	ldr x9,[sp, #0x18]
0098b0bc	cmp x8,x9
0098b0c0	b.ne 0x0098b0dc
0098b0c4	ldp x29,x30,[sp, #0x40]
0098b0c8	ldp x20,x19,[sp, #0x30]
0098b0cc	ldr x21,[sp, #0x20]
0098b0d0	mov x0,xzr
0098b0d4	add sp,sp,#0x50
0098b0d8	ret
0098b0dc	bl 0x00c2fec0
