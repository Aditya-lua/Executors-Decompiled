; FUN_00aef184 @ 00aef184
00aef184	str x23,[sp, #-0x40]!
00aef188	stp x22,x21,[sp, #0x10]
00aef18c	stp x20,x19,[sp, #0x20]
00aef190	stp x29,x30,[sp, #0x30]
00aef194	add x29,sp,#0x30
00aef198	cbz x0,0x00aef1e8
00aef19c	sub w8,w2,#0x1
00aef1a0	mov x19,x4
00aef1a4	mov w21,w3
00aef1a8	mov w20,w2
00aef1ac	mov w22,w1
00aef1b0	mov x23,x0
00aef1b4	cmp w8,#0x2
00aef1b8	b.hi 0x00aef220
00aef1bc	cbnz x19,0x00aef220
00aef1c0	bl 0x00c342a0
00aef1c4	adrp x0,0x2a0000
00aef1c8	adrp x2,0x2bc000
00aef1cc	add x0,x0,#0xc2f
00aef1d0	add x2,x2,#0x531
00aef1d4	mov w1,#0x6c
00aef1d8	bl 0x00c342b0
00aef1dc	mov w0,#0x28
00aef1e0	mov w1,#0x69
00aef1e4	b 0x00aef210
00aef1e8	bl 0x00c342a0
00aef1ec	adrp x0,0x2a0000
00aef1f0	adrp x2,0x2bc000
00aef1f4	add x0,x0,#0xc2f
00aef1f8	add x2,x2,#0x531
00aef1fc	mov w1,#0x69
00aef200	bl 0x00c342b0
00aef204	mov w1,#0x102
00aef208	mov w0,#0x28
00aef20c	movk w1,#0xc, LSL #16
00aef210	mov x2,xzr
00aef214	bl 0x00c342c0
00aef218	mov x0,xzr
00aef21c	b 0x00aef254
00aef220	adrp x1,0x2a0000
00aef224	add x1,x1,#0xc2f
00aef228	mov w0,#0x48
00aef22c	mov w2,#0x6d
00aef230	bl 0x00c34250
00aef234	cbz x0,0x00aef254
00aef238	cmp w22,#0x0
00aef23c	cset w8,ne
00aef240	str x23,[x0, #0x8]
00aef244	str w21,[x0, #0x10]
00aef248	str w20,[x0]
00aef24c	str w8,[x0, #0x40]
00aef250	str x19,[x0, #0x18]
00aef254	ldp x29,x30,[sp, #0x30]
00aef258	ldp x20,x19,[sp, #0x20]
00aef25c	ldp x22,x21,[sp, #0x10]
00aef260	ldr x23,[sp], #0x40
00aef264	ret
