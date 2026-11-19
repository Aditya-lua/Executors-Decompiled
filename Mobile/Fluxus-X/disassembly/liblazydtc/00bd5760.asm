; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::seekg @ 00bd5760
00bd5760	paciasp
00bd5764	sub sp,sp,#0x40
00bd5768	stp x29,x30,[sp, #0x10]
00bd576c	stp x22,x21,[sp, #0x20]
00bd5770	stp x20,x19,[sp, #0x30]
00bd5774	add x29,sp,#0x10
00bd5778	ldr x8,[x0]
00bd577c	mov x19,x0
00bd5780	mov x22,x1
00bd5784	mov w21,w2
00bd5788	ldur x8,[x8, #-0x18]
00bd578c	add x0,x0,x8
00bd5790	ldr w8,[x0, #0x20]
00bd5794	and w20,w8,#0xfffffffd
00bd5798	mov w1,w20
00bd579c	bl 0x00c30130
00bd57a0	sub x0,x29,#0x4
00bd57a4	mov x1,x19
00bd57a8	mov w2,#0x1
00bd57ac	bl 0x00c44060
00bd57b0	ldurb w8,[x29, #-0x4]
00bd57b4	cmp w8,#0x1
00bd57b8	b.ne 0x00bd5808
00bd57bc	ldr x8,[x19]
00bd57c0	ldur x8,[x8, #-0x18]
00bd57c4	add x8,x19,x8
00bd57c8	ldr x0,[x8, #0x28]
00bd57cc	ldr x8,[x0]
00bd57d0	ldr x8,[x8, #0x20]
00bd57d4	mov x1,x22
00bd57d8	mov w2,w21
00bd57dc	mov w3,#0x8
00bd57e0	blr x8
00bd57e4	orr w8,w20,#0x4
00bd57e8	cmn x1,#0x1
00bd57ec	csel w20,w8,w20,eq
00bd57f0	ldr x8,[x19]
00bd57f4	ldur x8,[x8, #-0x18]
00bd57f8	add x0,x19,x8
00bd57fc	ldr w8,[x0, #0x20]
00bd5800	orr w1,w8,w20
00bd5804	bl 0x00c30130
00bd5808	mov x0,x19
00bd580c	ldp x20,x19,[sp, #0x30]
00bd5810	ldp x22,x21,[sp, #0x20]
00bd5814	ldp x29,x30,[sp, #0x10]
00bd5818	add sp,sp,#0x40
00bd581c	autiasp
00bd5820	ret
