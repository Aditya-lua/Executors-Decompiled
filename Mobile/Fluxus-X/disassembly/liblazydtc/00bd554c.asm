; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::tellg @ 00bd554c
00bd554c	paciasp
00bd5550	stp x29,x30,[sp, #-0x30]!
00bd5554	str x21,[sp, #0x10]
00bd5558	stp x20,x19,[sp, #0x20]
00bd555c	mov x29,sp
00bd5560	mov x19,x0
00bd5564	add x0,x29,#0x1c
00bd5568	mov w2,#0x1
00bd556c	mov x1,x19
00bd5570	bl 0x00c44060
00bd5574	ldrb w8,[x29, #0x1c]
00bd5578	cmp w8,#0x1
00bd557c	b.ne 0x00bd55d8
00bd5580	ldr x8,[x19]
00bd5584	ldur x8,[x8, #-0x18]
00bd5588	add x8,x19,x8
00bd558c	ldr x0,[x8, #0x28]
00bd5590	ldr x8,[x0]
00bd5594	ldr x8,[x8, #0x20]
00bd5598	mov x1,xzr
00bd559c	mov w2,#0x1
00bd55a0	mov w3,#0x8
00bd55a4	blr x8
00bd55a8	mov x21,x1
00bd55ac	mov x20,x0
00bd55b0	mov w8,wzr
00bd55b4	ldr x9,[x19]
00bd55b8	ldur x9,[x9, #-0x18]
00bd55bc	add x0,x19,x9
00bd55c0	ldr w9,[x0, #0x20]
00bd55c4	orr w1,w9,w8
00bd55c8	bl 0x00c30130
00bd55cc	mov x0,x20
00bd55d0	mov x1,x21
00bd55d4	b 0x00bd55e0
00bd55d8	mov x0,xzr
00bd55dc	mov x1,#-0x1
00bd55e0	ldp x20,x19,[sp, #0x20]
00bd55e4	ldr x21,[sp, #0x10]
00bd55e8	ldp x29,x30,[sp], #0x30
00bd55ec	autiasp
00bd55f0	ret
