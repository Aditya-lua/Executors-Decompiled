; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::get @ 00bcff90
00bcff90	paciasp
00bcff94	stp x29,x30,[sp, #-0x50]!
00bcff98	str x25,[sp, #0x10]
00bcff9c	stp x24,x23,[sp, #0x20]
00bcffa0	stp x22,x21,[sp, #0x30]
00bcffa4	stp x20,x19,[sp, #0x40]
00bcffa8	mov x29,sp
00bcffac	mov x19,x0
00bcffb0	mov x20,x2
00bcffb4	mov x21,x1
00bcffb8	str xzr,[x0, #0x8]
00bcffbc	add x0,x29,#0x1c
00bcffc0	mov x1,x19
00bcffc4	mov w2,#0x1
00bcffc8	mov w22,w3
00bcffcc	bl 0x00c30140
00bcffd0	ldrb w8,[x29, #0x1c]
00bcffd4	cmp w8,#0x1
00bcffd8	b.ne 0x00bd00f4
00bcffdc	subs x23,x20,#0x1
00bcffe0	b.lt 0x00bd00a0
00bcffe4	ldr x9,[x19, #0x8]
00bcffe8	cmp x9,x23
00bcffec	b.ge 0x00bd00a8
00bcfff0	and w22,w22,#0xff
00bcfff4	add x24,x19,#0x28
00bcfff8	b 0x00bd0028
00bcfffc	ldr x9,[x19]
00bd0000	ldur x9,[x9, #-0x18]
00bd0004	ldr x0,[x24, x9#0x0]
00bd0008	ldp x9,x10,[x0, #0x18]
00bd000c	cmp x9,x10
00bd0010	b.eq 0x00bd008c
00bd0014	add x9,x9,#0x1
00bd0018	str x9,[x0, #0x18]
00bd001c	cmp x8,x23
00bd0020	mov x21,x25
00bd0024	b.ge 0x00bd00b8
00bd0028	ldr x8,[x19]
00bd002c	ldur x8,[x8, #-0x18]
00bd0030	ldr x0,[x24, x8#0x0]
00bd0034	ldp x8,x9,[x0, #0x18]
00bd0038	cmp x8,x9
00bd003c	b.eq 0x00bd0048
00bd0040	ldrb w0,[x8]
00bd0044	b 0x00bd005c
00bd0048	ldr x8,[x0]
00bd004c	ldr x8,[x8, #0x48]
00bd0050	blr x8
00bd0054	cmn w0,#0x1
00bd0058	b.eq 0x00bd00c4
00bd005c	and w8,w0,#0xff
00bd0060	cmp w22,w8
00bd0064	b.eq 0x00bd00b0
00bd0068	mov x25,x21
00bd006c	strb w8,[x25], #0x1
00bd0070	mov x8,#0x7fffffffffffffff
00bd0074	ldr x9,[x19, #0x8]
00bd0078	cmp x9,x8
00bd007c	b.eq 0x00bcfffc
00bd0080	add x8,x9,#0x1
00bd0084	str x8,[x19, #0x8]
00bd0088	b 0x00bcfffc
00bd008c	ldr x8,[x0]
00bd0090	ldr x8,[x8, #0x50]
00bd0094	blr x8
00bd0098	ldr x8,[x19, #0x8]
00bd009c	b 0x00bd001c
00bd00a0	mov w8,#0x4
00bd00a4	b 0x00bd00dc
00bd00a8	mov w8,wzr
00bd00ac	b 0x00bd00cc
00bd00b0	mov w8,wzr
00bd00b4	b 0x00bd00c8
00bd00b8	mov w8,wzr
00bd00bc	mov x21,x25
00bd00c0	b 0x00bd00c8
00bd00c4	mov w8,#0x2
00bd00c8	ldr x9,[x19, #0x8]
00bd00cc	orr w10,w8,#0x4
00bd00d0	cmp x9,#0x0
00bd00d4	csel w8,w10,w8,eq
00bd00d8	strb wzr,[x21]
00bd00dc	ldr x9,[x19]
00bd00e0	ldur x9,[x9, #-0x18]
00bd00e4	add x0,x19,x9
00bd00e8	ldr w9,[x0, #0x20]
00bd00ec	orr w1,w9,w8
00bd00f0	bl 0x00c30130
00bd00f4	cmp x20,#0x1
00bd00f8	b.lt 0x00bd0100
00bd00fc	strb wzr,[x21]
00bd0100	mov x0,x19
00bd0104	ldp x20,x19,[sp, #0x40]
00bd0108	ldr x25,[sp, #0x10]
00bd010c	ldp x22,x21,[sp, #0x30]
00bd0110	ldp x24,x23,[sp, #0x20]
00bd0114	ldp x29,x30,[sp], #0x50
00bd0118	autiasp
00bd011c	ret
