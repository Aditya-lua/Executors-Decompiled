; FUN_008bd380 @ 008bd380
008bd380	sub sp,sp,#0x30
008bd384	stp x29,x30,[sp, #0x10]
008bd388	stp x20,x19,[sp, #0x20]
008bd38c	add x29,sp,#0x10
008bd390	ldr w8,[x0, #0x8]
008bd394	cmp w8,#0x1
008bd398	b.lt 0x008bd3ec
008bd39c	ldr x9,[x0, #0x20]
008bd3a0	cmp w8,#0x1
008bd3a4	b.ne 0x008bd3b0
008bd3a8	mov x10,xzr
008bd3ac	b 0x008bd3d4
008bd3b0	and x10,x8,#0x7ffffffe
008bd3b4	add x11,x9,#0x1c
008bd3b8	mov x12,x10
008bd3bc	subs x12,x12,#0x2
008bd3c0	stur wzr,[x11, #-0x10]
008bd3c4	str wzr,[x11], #0x20
008bd3c8	b.ne 0x008bd3bc
008bd3cc	cmp x10,x8
008bd3d0	b.eq 0x008bd3ec
008bd3d4	add x9,x9,x10, LSL #0x4
008bd3d8	sub x8,x8,x10
008bd3dc	add x9,x9,#0xc
008bd3e0	subs x8,x8,#0x1
008bd3e4	str wzr,[x9], #0x10
008bd3e8	b.ne 0x008bd3e0
008bd3ec	ldr w8,[x0, #0xc]
008bd3f0	cmp w8,#0x1
008bd3f4	b.ge 0x008bd3fc
008bd3f8	str wzr,[x0, #0xc]
008bd3fc	adrp x8,0xd1f000
008bd400	add x8,x8,#0xc90
008bd404	ldr x19,[x0, #0x28]
008bd408	ldarb w8,[x8]
008bd40c	adrp x9,0xd1f000
008bd410	tbz w8,#0x0,0x008bd484
008bd414	ldr x8,[x9, #0xc88]
008bd418	add x8,x8,#0x7f3, LSL #12
008bd41c	add x8,x8,#0x700
008bd420	cmp x19,x8
008bd424	b.eq 0x008bd46c
008bd428	ldrb w9,[x0, #0x5]
008bd42c	mov w8,#0x1
008bd430	lsl w8,w8,w9
008bd434	cmp x9,#0x1f
008bd438	str w8,[x0, #0xc]
008bd43c	b.eq 0x008bd46c
008bd440	cmp w8,#0x1
008bd444	mov x9,xzr
008bd448	csinc w8,w8,wzr,gt
008bd44c	ubfiz x8,x8,#0x5,#0x20
008bd450	ldr x10,[x0, #0x28]
008bd454	add x10,x10,x9
008bd458	add x9,x9,#0x20
008bd45c	cmp x8,x9
008bd460	str wzr,[x10, #0xc]
008bd464	str wzr,[x10, #0x1c]
008bd468	b.ne 0x008bd450
008bd46c	mov w8,#0xff
008bd470	strb w8,[x0, #0x6]
008bd474	ldp x20,x19,[sp, #0x20]
008bd478	ldp x29,x30,[sp, #0x10]
008bd47c	add sp,sp,#0x30
008bd480	ret
008bd484	adrp x8,0xd1f000
008bd488	add x8,x8,#0xc90
008bd48c	str x0,[sp, #0x8]
008bd490	mov x0,x8
008bd494	bl 0x00c2fe90
008bd498	mov w8,w0
008bd49c	ldr x0,[sp, #0x8]
008bd4a0	adrp x9,0xd1f000
008bd4a4	cbz w8,0x008bd414
008bd4a8	adrp x8,0xcca000
008bd4ac	ldr x0,[x8, #0x8c8]
008bd4b0	bl 0x007fe1ec
008bd4b4	adrp x20,0xd1f000
008bd4b8	str x0,[x20, #0xc88]
008bd4bc	adrp x0,0xd1f000
008bd4c0	add x0,x0,#0xc90
008bd4c4	bl 0x00c2fea0
008bd4c8	ldr x0,[sp, #0x8]
008bd4cc	mov x9,x20
008bd4d0	b 0x008bd414
