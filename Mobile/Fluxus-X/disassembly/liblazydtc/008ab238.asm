; FUN_008ab238 @ 008ab238
008ab238	stp x29,x30,[sp, #-0x20]!
008ab23c	str x19,[sp, #0x10]
008ab240	mov x29,sp
008ab244	cmp w1,#0x1
008ab248	b.lt 0x008ab284
008ab24c	ldp x9,x8,[x0, #0x68]
008ab250	add x8,x8,w1, UXTW  #0x4
008ab254	sub x0,x8,#0x10
008ab258	cmp x0,x9
008ab25c	b.cc 0x008ab2a0
008ab260	adrp x8,0xd1f000
008ab264	add x8,x8,#0x1e0
008ab268	adrp x19,0xd1f000
008ab26c	ldarb w8,[x8]
008ab270	tbz w8,#0x0,0x008ab2d0
008ab274	ldr x8,[x19, #0x1d8]
008ab278	add x8,x8,#0x7f2, LSL #12
008ab27c	add x0,x8,#0xef0
008ab280	b 0x008ab2a0
008ab284	mov w8,#0xffffd8f1
008ab288	cmp w1,w8
008ab28c	b.lt 0x008ab29c
008ab290	ldr x8,[x0, #0x68]
008ab294	add x0,x8,w1, SXTW  #0x4
008ab298	b 0x008ab2a0
008ab29c	bl 0x008aea7c
008ab2a0	ldr w8,[x0, #0xc]
008ab2a4	cmp w8,#0x7
008ab2a8	b.ne 0x008ab2c0
008ab2ac	ldr x8,[x0]
008ab2b0	ldrb w8,[x8, #0x6]
008ab2b4	cmp w8,#0x0
008ab2b8	cset w0,ne
008ab2bc	b 0x008ab2c4
008ab2c0	mov w0,wzr
008ab2c4	ldr x19,[sp, #0x10]
008ab2c8	ldp x29,x30,[sp], #0x20
008ab2cc	ret
008ab2d0	adrp x0,0xd1f000
008ab2d4	add x0,x0,#0x1e0
008ab2d8	bl 0x00c2fe90
008ab2dc	cbz w0,0x008ab274
008ab2e0	adrp x8,0xcca000
008ab2e4	ldr x0,[x8, #0x8c8]
008ab2e8	bl 0x007fe1ec
008ab2ec	str x0,[x19, #0x1d8]
008ab2f0	adrp x0,0xd1f000
008ab2f4	add x0,x0,#0x1e0
008ab2f8	bl 0x00c2fea0
008ab2fc	b 0x008ab274
