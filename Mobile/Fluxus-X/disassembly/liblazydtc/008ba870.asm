; FUN_008ba870 @ 008ba870
008ba870	stp x29,x30,[sp, #-0x40]!
008ba874	str x23,[sp, #0x10]
008ba878	stp x22,x21,[sp, #0x20]
008ba87c	stp x20,x19,[sp, #0x30]
008ba880	mov x29,sp
008ba884	adrp x8,0xd1f000
008ba888	add x8,x8,#0xc90
008ba88c	ldr x21,[x0, #0x28]
008ba890	ldarb w8,[x8]
008ba894	mov w20,w1
008ba898	mov x19,x0
008ba89c	adrp x22,0xd1f000
008ba8a0	tbz w8,#0x0,0x008ba914
008ba8a4	ldr x8,[x22, #0xc88]
008ba8a8	add x8,x8,#0x7f3, LSL #12
008ba8ac	add x8,x8,#0x700
008ba8b0	cmp x21,x8
008ba8b4	b.eq 0x008ba8c0
008ba8b8	mov w22,#0x1
008ba8bc	b 0x008ba8cc
008ba8c0	ldr w8,[x19, #0x8]
008ba8c4	cmp w20,w8
008ba8c8	cset w22,lt
008ba8cc	sub w23,w2,#0x1
008ba8d0	b 0x008ba8d8
008ba8d4	mov w20,w21
008ba8d8	cmp w23,w20
008ba8dc	add w21,w20,#0x1
008ba8e0	b.eq 0x008ba8d4
008ba8e4	cbz w22,0x008ba8fc
008ba8e8	mov x0,x19
008ba8ec	mov w1,w21
008ba8f0	bl 0x008bb19c
008ba8f4	ldr w8,[x0, #0xc]
008ba8f8	cbnz w8,0x008ba8d4
008ba8fc	mov w0,w20
008ba900	ldp x20,x19,[sp, #0x30]
008ba904	ldr x23,[sp, #0x10]
008ba908	ldp x22,x21,[sp, #0x20]
008ba90c	ldp x29,x30,[sp], #0x40
008ba910	ret
008ba914	adrp x0,0xd1f000
008ba918	add x0,x0,#0xc90
008ba91c	mov w23,w2
008ba920	bl 0x00c2fe90
008ba924	mov w2,w23
008ba928	cbz w0,0x008ba8a4
008ba92c	adrp x8,0xcca000
008ba930	ldr x0,[x8, #0x8c8]
008ba934	bl 0x007fe1ec
008ba938	str x0,[x22, #0xc88]
008ba93c	adrp x0,0xd1f000
008ba940	add x0,x0,#0xc90
008ba944	bl 0x00c2fea0
008ba948	mov w2,w23
008ba94c	b 0x008ba8a4
