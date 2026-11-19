; FUN_00c1e7f4 @ 00c1e7f4
00c1e7f4	paciasp
00c1e7f8	stp x29,x30,[sp, #-0x10]!
00c1e7fc	mov x29,sp
00c1e800	ldp x9,x10,[x0]
00c1e804	ldr x8,[x9, #0x2a0]
00c1e808	ldr x11,[x9, #0x298]
00c1e80c	sub x8,x8,x11
00c1e810	cmp x10,x8, ASR #0x3
00c1e814	b.hi 0x00c1e84c
00c1e818	ldr x8,[x0, #0x10]
00c1e81c	add x10,x11,x10, LSL #0x3
00c1e820	add x11,x0,#0x28
00c1e824	cmp x8,x11
00c1e828	str x10,[x9, #0x2a0]
00c1e82c	b.eq 0x00c1e840
00c1e830	mov x0,x8
00c1e834	ldp x29,x30,[sp], #0x10
00c1e838	autiasp
00c1e83c	b 0x00c30960
00c1e840	ldp x29,x30,[sp], #0x10
00c1e844	autiasp
00c1e848	ret
00c1e84c	adrp x0,0x29f000
00c1e850	add x0,x0,#0x357
00c1e854	adrp x1,0x2c0000
00c1e858	add x1,x1,#0xcf7
00c1e85c	adrp x3,0x2ab000
00c1e860	add x3,x3,#0x32c
00c1e864	mov w2,#0xac7
00c1e868	bl 0x00c0de94
