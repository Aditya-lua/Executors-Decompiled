; FUN_008ab66c @ 008ab66c
008ab66c	sub sp,sp,#0x50
008ab670	stp x29,x30,[sp, #0x20]
008ab674	str x21,[sp, #0x30]
008ab678	stp x20,x19,[sp, #0x40]
008ab67c	add x29,sp,#0x20
008ab680	mrs x20,tpidr_el0
008ab684	mov x19,x2
008ab688	ldr x8,[x20, #0x28]
008ab68c	cmp w1,#0x1
008ab690	stur x8,[x29, #-0x8]
008ab694	b.lt 0x008ab6d0
008ab698	ldp x9,x8,[x0, #0x68]
008ab69c	add x8,x8,w1, UXTW  #0x4
008ab6a0	sub x0,x8,#0x10
008ab6a4	cmp x0,x9
008ab6a8	b.cc 0x008ab6ec
008ab6ac	adrp x8,0xd1f000
008ab6b0	add x8,x8,#0x1e0
008ab6b4	ldarb w9,[x8]
008ab6b8	adrp x8,0xd1f000
008ab6bc	tbz w9,#0x0,0x008ab748
008ab6c0	ldr x8,[x8, #0x1d8]
008ab6c4	add x8,x8,#0x7f2, LSL #12
008ab6c8	add x0,x8,#0xef0
008ab6cc	b 0x008ab6ec
008ab6d0	mov w8,#0xffffd8f1
008ab6d4	cmp w1,w8
008ab6d8	b.lt 0x008ab6e8
008ab6dc	ldr x8,[x0, #0x68]
008ab6e0	add x0,x8,w1, SXTW  #0x4
008ab6e4	b 0x008ab6ec
008ab6e8	bl 0x008aea7c
008ab6ec	ldr w8,[x0, #0xc]
008ab6f0	cmp w8,#0x3
008ab6f4	b.eq 0x008ab704
008ab6f8	add x1,sp,#0x8
008ab6fc	bl 0x008cacb4
008ab700	cbz x0,0x008ab73c
008ab704	ldr d0,[x0]
008ab708	fcvtzs w0,d0
008ab70c	cbz x19,0x008ab718
008ab710	mov w8,#0x1
008ab714	str w8,[x19]
008ab718	ldr x8,[x20, #0x28]
008ab71c	ldur x9,[x29, #-0x8]
008ab720	cmp x8,x9
008ab724	b.ne 0x008ab7ac
008ab728	ldp x20,x19,[sp, #0x40]
008ab72c	ldr x21,[sp, #0x30]
008ab730	ldp x29,x30,[sp, #0x20]
008ab734	add sp,sp,#0x50
008ab738	ret
008ab73c	mov w8,wzr
008ab740	cbnz x19,0x008ab714
008ab744	b 0x008ab718
008ab748	adrp x0,0xd1f000
008ab74c	add x0,x0,#0x1e0
008ab750	bl 0x00c2fe90
008ab754	adrp x8,0xd1f000
008ab758	cbz w0,0x008ab6c0
008ab75c	adrp x8,0xcca000
008ab760	ldr x0,[x8, #0x8c8]
008ab764	bl 0x007fe1ec
008ab768	adrp x21,0xd1f000
008ab76c	str x0,[x21, #0x1d8]
008ab770	adrp x0,0xd1f000
008ab774	add x0,x0,#0x1e0
008ab778	bl 0x00c2fea0
008ab77c	mov x8,x21
008ab780	b 0x008ab6c0
008ab7ac	bl 0x00c2fec0
