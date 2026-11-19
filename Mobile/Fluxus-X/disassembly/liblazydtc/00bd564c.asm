; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::seekg @ 00bd564c
00bd564c	paciasp
00bd5650	sub sp,sp,#0x40
00bd5654	stp x29,x30,[sp, #0x10]
00bd5658	stp x22,x21,[sp, #0x20]
00bd565c	stp x20,x19,[sp, #0x30]
00bd5660	add x29,sp,#0x10
00bd5664	ldr x8,[x0]
00bd5668	mov x19,x0
00bd566c	mov x22,x1
00bd5670	mov x21,x2
00bd5674	ldur x8,[x8, #-0x18]
00bd5678	add x0,x0,x8
00bd567c	ldr w8,[x0, #0x20]
00bd5680	and w20,w8,#0xfffffffd
00bd5684	mov w1,w20
00bd5688	bl 0x00c30130
00bd568c	sub x0,x29,#0x4
00bd5690	mov x1,x19
00bd5694	mov w2,#0x1
00bd5698	bl 0x00c44060
00bd569c	ldurb w8,[x29, #-0x4]
00bd56a0	cmp w8,#0x1
00bd56a4	b.ne 0x00bd56f4
00bd56a8	ldr x8,[x19]
00bd56ac	ldur x8,[x8, #-0x18]
00bd56b0	add x8,x19,x8
00bd56b4	ldr x0,[x8, #0x28]
00bd56b8	ldr x8,[x0]
00bd56bc	ldr x8,[x8, #0x28]
00bd56c0	mov x1,x22
00bd56c4	mov x2,x21
00bd56c8	mov w3,#0x8
00bd56cc	blr x8
00bd56d0	orr w8,w20,#0x4
00bd56d4	cmn x1,#0x1
00bd56d8	csel w20,w8,w20,eq
00bd56dc	ldr x8,[x19]
00bd56e0	ldur x8,[x8, #-0x18]
00bd56e4	add x0,x19,x8
00bd56e8	ldr w8,[x0, #0x20]
00bd56ec	orr w1,w8,w20
00bd56f0	bl 0x00c30130
00bd56f4	mov x0,x19
00bd56f8	ldp x20,x19,[sp, #0x30]
00bd56fc	ldp x22,x21,[sp, #0x20]
00bd5700	ldp x29,x30,[sp, #0x10]
00bd5704	add sp,sp,#0x40
00bd5708	autiasp
00bd570c	ret
