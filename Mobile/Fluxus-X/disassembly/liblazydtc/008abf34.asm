; FUN_008abf34 @ 008abf34
008abf34	stp x29,x30,[sp, #-0x20]!
008abf38	str x19,[sp, #0x10]
008abf3c	mov x29,sp
008abf40	cmp w1,#0x1
008abf44	b.lt 0x008abf80
008abf48	ldp x9,x8,[x0, #0x68]
008abf4c	add x8,x8,w1, UXTW  #0x4
008abf50	sub x0,x8,#0x10
008abf54	cmp x0,x9
008abf58	b.cc 0x008abf9c
008abf5c	adrp x8,0xd1f000
008abf60	add x8,x8,#0x1e0
008abf64	adrp x19,0xd1f000
008abf68	ldarb w8,[x8]
008abf6c	tbz w8,#0x0,0x008abfdc
008abf70	ldr x8,[x19, #0x1d8]
008abf74	add x8,x8,#0x7f2, LSL #12
008abf78	add x0,x8,#0xef0
008abf7c	b 0x008abf9c
008abf80	mov w8,#0xffffd8f1
008abf84	cmp w1,w8
008abf88	b.lt 0x008abf98
008abf8c	ldr x8,[x0, #0x68]
008abf90	add x0,x8,w1, SXTW  #0x4
008abf94	b 0x008abf9c
008abf98	bl 0x008aea7c
008abf9c	ldr w8,[x0, #0xc]
008abfa0	cmp w8,#0x2
008abfa4	b.eq 0x008abfc4
008abfa8	cmp w8,#0x8
008abfac	b.ne 0x008abfbc
008abfb0	ldr x8,[x0]
008abfb4	add x0,x8,#0x10
008abfb8	b 0x008abfd0
008abfbc	cmp w8,#0x5
008abfc0	b.lt 0x008abfcc
008abfc4	ldr x0,[x0]
008abfc8	b 0x008abfd0
008abfcc	mov x0,xzr
008abfd0	ldr x19,[sp, #0x10]
008abfd4	ldp x29,x30,[sp], #0x20
008abfd8	ret
008abfdc	adrp x0,0xd1f000
008abfe0	add x0,x0,#0x1e0
008abfe4	bl 0x00c2fe90
008abfe8	cbz w0,0x008abf70
008abfec	adrp x8,0xcca000
008abff0	ldr x0,[x8, #0x8c8]
008abff4	bl 0x007fe1ec
008abff8	str x0,[x19, #0x1d8]
008abffc	adrp x0,0xd1f000
008ac000	add x0,x0,#0x1e0
008ac004	bl 0x00c2fea0
008ac008	b 0x008abf70
