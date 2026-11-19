; FUN_008ad4b0 @ 008ad4b0
008ad4b0	sub sp,sp,#0x40
008ad4b4	stp x29,x30,[sp, #0x10]
008ad4b8	str x21,[sp, #0x20]
008ad4bc	stp x20,x19,[sp, #0x30]
008ad4c0	add x29,sp,#0x10
008ad4c4	mrs x21,tpidr_el0
008ad4c8	mov x19,x0
008ad4cc	mov w20,w1
008ad4d0	ldr x8,[x21, #0x28]
008ad4d4	str x8,[sp, #0x8]
008ad4d8	ldrb w8,[x0, #0x2]
008ad4dc	tbz w8,#0x2,0x008ad4f0
008ad4e0	add x2,x19,#0x38
008ad4e4	mov x0,x19
008ad4e8	mov x1,x19
008ad4ec	bl 0x008b63a4
008ad4f0	ldr x9,[x19, #0x50]
008ad4f4	ldr x8,[x19, #0x68]
008ad4f8	ldr x10,[x9, #0x18]
008ad4fc	add x11,x8,#0x10
008ad500	cmp x11,x10
008ad504	b.ls 0x008ad56c
008ad508	ldr x11,[x19, #0x70]
008ad50c	mov w12,#0xf3f0
008ad510	movk w12,#0x1, LSL #16
008ad514	sub x11,x8,x11
008ad518	cmp x11,x12
008ad51c	b.gt 0x008ad688
008ad520	ldr x11,[x19, #0x48]
008ad524	sub x11,x11,x8
008ad528	cmp x11,#0x10
008ad52c	b.gt 0x008ad55c
008ad530	mov w8,#0x1
008ad534	nop
008ad538	adr x1,0x8aa604
008ad53c	add x2,sp,#0x4
008ad540	mov x0,x19
008ad544	str w8,[sp, #0x4]
008ad548	bl 0x008b3edc
008ad54c	cbnz w0,0x008ad688
008ad550	ldr x9,[x19, #0x50]
008ad554	ldr x8,[x19, #0x68]
008ad558	ldr x10,[x9, #0x18]
008ad55c	add x11,x8,#0x10
008ad560	cmp x10,x11
008ad564	b.cs 0x008ad56c
008ad568	str x11,[x9, #0x18]
008ad56c	cmp w20,#0x1
008ad570	b.lt 0x008ad5ac
008ad574	ldr x9,[x19, #0x70]
008ad578	add x9,x9,w20, UXTW  #0x4
008ad57c	sub x0,x9,#0x10
008ad580	cmp x0,x8
008ad584	b.cc 0x008ad5cc
008ad588	adrp x8,0xd1f000
008ad58c	add x8,x8,#0x1e0
008ad590	adrp x20,0xd1f000
008ad594	ldarb w8,[x8]
008ad598	tbz w8,#0x0,0x008ad6b0
008ad59c	ldr x8,[x20, #0x1d8]
008ad5a0	add x8,x8,#0x7f2, LSL #12
008ad5a4	add x0,x8,#0xef0
008ad5a8	b 0x008ad5cc
008ad5ac	mov w9,#0xffffd8f1
008ad5b0	cmp w20,w9
008ad5b4	b.lt 0x008ad5c0
008ad5b8	add x0,x8,w20, SXTW  #0x4
008ad5bc	b 0x008ad5cc
008ad5c0	mov x0,x19
008ad5c4	mov w1,w20
008ad5c8	bl 0x008aea7c
008ad5cc	ldr w8,[x0, #0xc]
008ad5d0	cmp w8,#0xc
008ad5d4	b.eq 0x008ad610
008ad5d8	cmp w8,#0x8
008ad5dc	b.eq 0x008ad5fc
008ad5e0	cmp w8,#0x6
008ad5e4	b.ne 0x008ad66c
008ad5e8	ldr x8,[x0]
008ad5ec	add x8,x8,#0x10
008ad5f0	ldr x8,[x8]
008ad5f4	cbnz x8,0x008ad624
008ad5f8	b 0x008ad640
008ad5fc	ldr x8,[x0]
008ad600	add x8,x8,#0x8
008ad604	ldr x8,[x8]
008ad608	cbnz x8,0x008ad624
008ad60c	b 0x008ad640
008ad610	ldr x8,[x0]
008ad614	ldr x8,[x8, #0x10]
008ad618	add x8,x8,#0x50
008ad61c	ldr x8,[x8]
008ad620	cbz x8,0x008ad640
008ad624	ldr x9,[x19, #0x68]
008ad628	mov w11,#0x6
008ad62c	str x8,[x9]
008ad630	ldr x10,[x19, #0x68]
008ad634	str w11,[x9, #0xc]
008ad638	add x9,x10,#0x10
008ad63c	str x9,[x19, #0x68]
008ad640	ldr x9,[x21, #0x28]
008ad644	ldr x10,[sp, #0x8]
008ad648	cmp x8,#0x0
008ad64c	cset w0,ne
008ad650	cmp x9,x10
008ad654	b.ne 0x008ad708
008ad658	ldp x20,x19,[sp, #0x30]
008ad65c	ldr x21,[sp, #0x20]
008ad660	ldp x29,x30,[sp, #0x10]
008ad664	add sp,sp,#0x40
008ad668	ret
008ad66c	sxtw x8,w8
008ad670	ldr x9,[x19, #0x60]
008ad674	add x8,x9,x8, LSL #0x3
008ad678	add x8,x8,#0x448
008ad67c	ldr x8,[x8]
008ad680	cbnz x8,0x008ad624
008ad684	b 0x008ad640
008ad688	adrp x1,0x2b6000
008ad68c	add x1,x1,#0xc71
008ad690	mov x0,x19
008ad694	bl 0x008b9568
008ad698	ldr x8,[x21, #0x28]
008ad69c	ldr x9,[sp, #0x8]
008ad6a0	cmp x8,x9
008ad6a4	b.ne 0x008ad708
008ad6a8	mov x0,x19
008ad6ac	bl 0x008aa5f4
008ad6b0	adrp x0,0xd1f000
008ad6b4	add x0,x0,#0x1e0
008ad6b8	bl 0x00c2fe90
008ad6bc	cbz w0,0x008ad59c
008ad6c0	adrp x8,0xcca000
008ad6c4	ldr x0,[x8, #0x8c8]
008ad6c8	bl 0x007fe1ec
008ad6cc	str x0,[x20, #0x1d8]
008ad6d0	adrp x0,0xd1f000
008ad6d4	add x0,x0,#0x1e0
008ad6d8	bl 0x00c2fea0
008ad6dc	b 0x008ad59c
008ad708	bl 0x00c2fec0
