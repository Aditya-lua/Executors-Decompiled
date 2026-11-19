; ix::Socket::close @ 009849b8
009849b8	stp x20,x19,[sp, #-0x20]!
009849bc	stp x29,x30,[sp, #0x10]
009849c0	add x29,sp,#0x10
009849c4	add x19,x0,#0xc
009849c8	mov x20,x0
009849cc	mov x0,x19
009849d0	bl 0x00c2ff10
009849d4	add x8,x20,#0x8
009849d8	ldar w9,[x8]
009849dc	cmn w9,#0x1
009849e0	b.eq 0x009849f8
009849e4	ldar w0,[x8]
009849e8	bl 0x00c31bf0
009849ec	add x8,x20,#0x8
009849f0	mov w9,#0xffffffff
009849f4	stlr w9,[x8]
009849f8	ldp x29,x30,[sp, #0x10]
009849fc	mov x0,x19
00984a00	ldp x20,x19,[sp], #0x20
00984a04	b 0x00c2ff20
