; std::__ndk1::__thread_proxy<std::__ndk1::tuple<std::__ndk1::unique_ptr<std::__ndk1::__thread_struct,std::__ndk1::default_delete<std::__ndk1::__thread_struct>>,void(ix::DNSLookup::*)(std::__ndk1::weak_ptr<ix::DNSLookup>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,int),ix::DNSLookup*,std::__ndk1::weak_ptr<ix::DNSLookup>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,int>> @ 009876d0
009876d0	sub sp,sp,#0x70
009876d4	str x21,[sp, #0x40]
009876d8	stp x20,x19,[sp, #0x50]
009876dc	stp x29,x30,[sp, #0x60]
009876e0	add x29,sp,#0x60
009876e4	mrs x21,tpidr_el0
009876e8	ldr x8,[x21, #0x28]
009876ec	mov x19,x0
009876f0	stur x8,[x29, #-0x28]
009876f4	bl 0x00c30180
009876f8	ldr x1,[x19]
009876fc	str xzr,[x19]
00987700	ldr w0,[x0]
00987704	bl 0x00c30190
00987708	ldp x11,x10,[x19, #0x10]
0098770c	ldr x8,[x19, #0x8]
00987710	add x9,x19,#0x20
00987714	add x20,x19,#0x30
00987718	add x0,x10,x11, ASR #0x1
0098771c	tbz w11,#0x0,0x00987728
00987720	ldr x10,[x0]
00987724	ldr x8,[x10, x8#0x0]
00987728	ldr q0,[x19, #0x20]
0098772c	str q0,[sp, #0x20]
00987730	stp xzr,xzr,[x9]
00987734	ldr x9,[x20, #0x10]
00987738	str x9,[sp, #0x10]
0098773c	ldr q0,[x20]
00987740	str q0,[sp]
00987744	stp xzr,xzr,[x20, #0x8]
00987748	str xzr,[x20]
0098774c	ldr w3,[x19, #0x48]
00987750	add x1,sp,#0x20
00987754	mov x2,sp
00987758	blr x8
0098775c	ldrb w8,[sp]
00987760	tbz w8,#0x0,0x0098776c
00987764	ldr x0,[sp, #0x10]
00987768	bl 0x00c301d0
0098776c	ldr x0,[sp, #0x28]
00987770	cbz x0,0x00987778
00987774	bl 0x00c2ff00
00987778	ldrb w8,[x20]
0098777c	tbz w8,#0x0,0x00987788
00987780	ldr x0,[x19, #0x40]
00987784	bl 0x00c301d0
00987788	ldr x0,[x19, #0x28]
0098778c	cbz x0,0x00987794
00987790	bl 0x00c2ff00
00987794	ldr x20,[x19]
00987798	str xzr,[x19]
0098779c	cbz x20,0x009877b0
009877a0	mov x0,x20
009877a4	bl 0x00c301a0
009877a8	mov x0,x20
009877ac	bl 0x00c301d0
009877b0	mov x0,x19
009877b4	bl 0x00c301d0
009877b8	ldr x8,[x21, #0x28]
009877bc	ldur x9,[x29, #-0x28]
009877c0	cmp x8,x9
009877c4	b.ne 0x009877e0
009877c8	ldp x29,x30,[sp, #0x60]
009877cc	ldp x20,x19,[sp, #0x50]
009877d0	ldr x21,[sp, #0x40]
009877d4	mov x0,xzr
009877d8	add sp,sp,#0x70
009877dc	ret
009877e0	bl 0x00c2fec0
