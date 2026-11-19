; cpr::GlobalThreadPool::ExitInstance @ 008fb040
008fb040	str x19,[sp, #-0x20]!
008fb044	stp x29,x30,[sp, #0x10]
008fb048	add x29,sp,#0x10
008fb04c	adrp x0,0xcb4000
008fb050	ldr x0,[x0, #0xc70]
008fb054	bl 0x00c2ff10
008fb058	adrp x19,0xcb4000
008fb05c	ldr x19,[x19, #0xc68]
008fb060	ldr x0,[x19]
008fb064	cbz x0,0x008fb078
008fb068	ldr x8,[x0]
008fb06c	ldr x8,[x8, #0x8]
008fb070	blr x8
008fb074	str xzr,[x19]
008fb078	adrp x0,0xcb4000
008fb07c	ldr x0,[x0, #0xc70]
008fb080	ldp x29,x30,[sp, #0x10]
008fb084	ldr x19,[sp], #0x20
008fb088	b 0x00c2ff20
