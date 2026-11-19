; FUN_00c0bfac @ 00c0bfac
00c0bfac	paciasp
00c0bfb0	stp x29,x30,[sp, #-0x50]!
00c0bfb4	str x25,[sp, #0x10]
00c0bfb8	stp x24,x23,[sp, #0x20]
00c0bfbc	stp x22,x21,[sp, #0x30]
00c0bfc0	stp x20,x19,[sp, #0x40]
00c0bfc4	mov x29,sp
00c0bfc8	cmp x0,x1
00c0bfcc	mov x19,x2
00c0bfd0	b.eq 0x00c0c05c
00c0bfd4	mov w22,w3
00c0bfd8	mov x20,x1
00c0bfdc	mov x23,x0
00c0bfe0	bl 0x00c30710
00c0bfe4	ldr w24,[x0]
00c0bfe8	str wzr,[x0]
00c0bfec	adrp x8,0xd27000
00c0bff0	add x8,x8,#0xf8
00c0bff4	mov x21,x0
00c0bff8	adrp x25,0xd27000
00c0bffc	ldarb w8,[x8]
00c0c000	tbz w8,#0x0,0x00c0c084
00c0c004	ldr x3,[x25, #0xf0]
00c0c008	add x1,x29,#0x18
00c0c00c	mov x0,x23
00c0c010	mov w2,w22
00c0c014	bl 0x00c43930
00c0c018	ldr w8,[x21]
00c0c01c	cbz w8,0x00c0c04c
00c0c020	ldr x9,[x29, #0x18]
00c0c024	cmp x9,x20
00c0c028	b.ne 0x00c0c05c
00c0c02c	cmp w8,#0x22
00c0c030	b.ne 0x00c0c068
00c0c034	mov w8,#0x4
00c0c038	cmp x0,#0x0
00c0c03c	mov x9,#0x7fffffffffffffff
00c0c040	str w8,[x19]
00c0c044	cinv x0,x9,le
00c0c048	b 0x00c0c068
00c0c04c	ldr x8,[x29, #0x18]
00c0c050	str w24,[x21]
00c0c054	cmp x8,x20
00c0c058	b.eq 0x00c0c068
00c0c05c	mov x0,xzr
00c0c060	mov w8,#0x4
00c0c064	str w8,[x19]
00c0c068	ldp x20,x19,[sp, #0x40]
00c0c06c	ldr x25,[sp, #0x10]
00c0c070	ldp x22,x21,[sp, #0x30]
00c0c074	ldp x24,x23,[sp, #0x20]
00c0c078	ldp x29,x30,[sp], #0x50
00c0c07c	autiasp
00c0c080	ret
00c0c084	adrp x0,0xd27000
00c0c088	add x0,x0,#0xf8
00c0c08c	bl 0x00c2fe90
00c0c090	cbz w0,0x00c0c004
00c0c094	adrp x1,0x2c6000
00c0c098	add x1,x1,#0xbfc
00c0c09c	mov w0,#0x1fbf
00c0c0a0	mov x2,xzr
00c0c0a4	bl 0x00c43890
00c0c0a8	str x0,[x25, #0xf0]
00c0c0ac	adrp x0,0xd27000
00c0c0b0	add x0,x0,#0xf8
00c0c0b4	bl 0x00c2fea0
00c0c0b8	b 0x00c0c004
