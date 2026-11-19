; FUN_008ba760 @ 008ba760
008ba760	sub sp,sp,#0x40
008ba764	stp x29,x30,[sp, #0x10]
008ba768	str x21,[sp, #0x20]
008ba76c	stp x20,x19,[sp, #0x30]
008ba770	add x29,sp,#0x10
008ba774	mov w8,#0x1
008ba778	mov x19,x0
008ba77c	movk w8,#0x400, LSL #16
008ba780	cmp w2,w8
008ba784	b.ge 0x008ba800
008ba788	adrp x8,0xd1f000
008ba78c	add x8,x8,#0xc90
008ba790	ldr x20,[x1, #0x28]
008ba794	ldarb w8,[x8]
008ba798	adrp x21,0xd1f000
008ba79c	tbz w8,#0x0,0x008ba810
008ba7a0	ldr x8,[x21, #0xc88]
008ba7a4	add x8,x8,#0x7f3, LSL #12
008ba7a8	add x8,x8,#0x700
008ba7ac	cmp x20,x8
008ba7b0	b.eq 0x008ba7c4
008ba7b4	ldrb w8,[x1, #0x5]
008ba7b8	mov w9,#0x1
008ba7bc	lsl w20,w9,w8
008ba7c0	b 0x008ba7c8
008ba7c4	mov w20,wzr
008ba7c8	mov x0,x1
008ba7cc	mov x21,x1
008ba7d0	mov w1,w2
008ba7d4	mov w2,#0xffffffff
008ba7d8	bl 0x008ba870
008ba7dc	mov w2,w0
008ba7e0	mov x0,x19
008ba7e4	mov x1,x21
008ba7e8	mov w3,w20
008ba7ec	ldp x20,x19,[sp, #0x30]
008ba7f0	ldr x21,[sp, #0x20]
008ba7f4	ldp x29,x30,[sp, #0x10]
008ba7f8	add sp,sp,#0x40
008ba7fc	b 0x008ba968
008ba800	adrp x1,0x2d2000
008ba804	add x1,x1,#0xd52
008ba808	mov x0,x19
008ba80c	bl 0x008b39cc
008ba810	adrp x0,0xd1f000
008ba814	add x0,x0,#0xc90
008ba818	str x1,[x29, #0x18]
008ba81c	stur w2,[x29, #-0x4]
008ba820	bl 0x00c2fe90
008ba824	ldur w2,[x29, #-0x4]
008ba828	ldr x1,[x29, #0x18]
008ba82c	cbz w0,0x008ba7a0
008ba830	adrp x8,0xcca000
008ba834	ldr x0,[x8, #0x8c8]
008ba838	bl 0x007fe1ec
008ba83c	str x0,[x21, #0xc88]
008ba840	adrp x0,0xd1f000
008ba844	add x0,x0,#0xc90
008ba848	bl 0x00c2fea0
008ba84c	ldr x1,[x29, #0x18]
008ba850	ldur w2,[x29, #-0x4]
008ba854	b 0x008ba7a0
