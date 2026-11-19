; _INIT_6 @ 007fbf94
007fbf94	stp x29,x30,[sp, #-0x10]!
007fbf98	mov x29,sp
007fbf9c	adrp x8,0xcca000
007fbfa0	add x8,x8,#0x8a0
007fbfa4	ldarb w8,[x8]
007fbfa8	tbnz w8,#0x0,0x007fc014
007fbfac	adrp x0,0xcca000
007fbfb0	add x0,x0,#0x8a0
007fbfb4	bl 0x00c2fe90
007fbfb8	cbz w0,0x007fc014
007fbfbc	adrp x8,0xcca000
007fbfc0	add x8,x8,#0x9b8
007fbfc4	ldarb w9,[x8]
007fbfc8	adrp x8,0xcca000
007fbfcc	add x8,x8,#0x9a8
007fbfd0	tbz w9,#0x0,0x007fc01c
007fbfd4	adrp x9,0xcca000
007fbfd8	ldrb w9,[x9, #0x9b0]
007fbfdc	cmp w9,#0x1
007fbfe0	b.ne 0x007fbffc
007fbfe4	adrp x9,0x29b000
007fbfe8	ldr d0,[x8]
007fbfec	strb wzr,[x8, #0x8]
007fbff0	ldr d1,[x9, #0x480]
007fbff4	eor v0.8B,v0.8B,v1.8B
007fbff8	str d0,[x8]
007fbffc	adrp x9,0xcca000
007fc000	adrp x0,0xcca000
007fc004	add x0,x0,#0x8a0
007fc008	str x8,[x9, #0x898]
007fc00c	ldp x29,x30,[sp], #0x10
007fc010	b 0x00c2fea0
007fc014	ldp x29,x30,[sp], #0x10
007fc018	ret
007fc01c	adrp x0,0xcca000
007fc020	add x0,x0,#0x9b8
007fc024	bl 0x00c2fe90
007fc028	adrp x8,0xcca000
007fc02c	add x8,x8,#0x9a8
007fc030	cbz w0,0x007fbfd4
007fc034	adrp x9,0x29a000
007fc038	mov w10,#0x1
007fc03c	nop
007fc040	adr x0,0x7fdd54
007fc044	ldr d0,[x9, #0x550]
007fc048	adrp x2,0xc48000
007fc04c	add x2,x2,#0x880
007fc050	adrp x1,0xcca000
007fc054	add x1,x1,#0x9a8
007fc058	strb w10,[x8, #0x8]
007fc05c	str d0,[x8]
007fc060	bl 0x00c2fe70
007fc064	adrp x0,0xcca000
007fc068	add x0,x0,#0x9b8
007fc06c	bl 0x00c2fea0
007fc070	adrp x8,0xcca000
007fc074	add x8,x8,#0x9a8
007fc078	b 0x007fbfd4
