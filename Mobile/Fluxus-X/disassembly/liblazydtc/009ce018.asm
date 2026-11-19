; ssl3_do_uncompress @ 009ce018
009ce018	stp x20,x19,[sp, #-0x20]!
009ce01c	stp x29,x30,[sp, #0x10]
009ce020	mov x19,x1
009ce024	ldr x1,[x1, #0x30]
009ce028	mov x20,x0
009ce02c	add x29,sp,#0x10
009ce030	cbnz x1,0x009ce054
009ce034	adrp x1,0x2cf000
009ce038	add x1,x1,#0x7d6
009ce03c	mov w0,#0x4540
009ce040	mov w2,#0x325
009ce044	bl 0x00c32320
009ce048	mov x1,x0
009ce04c	str x0,[x19, #0x30]
009ce050	cbz x0,0x009ce088
009ce054	ldr x0,[x20, #0x870]
009ce058	ldr x3,[x19, #0x20]
009ce05c	ldr w4,[x19, #0x8]
009ce060	mov w2,#0x4000
009ce064	bl 0x00c36d30
009ce068	tbnz w0,#0x1f,0x009ce084
009ce06c	ldr x8,[x19, #0x30]
009ce070	sxtw x9,w0
009ce074	mov w0,#0x1
009ce078	str x9,[x19, #0x8]
009ce07c	str x8,[x19, #0x20]
009ce080	b 0x009ce088
009ce084	mov w0,wzr
009ce088	ldp x29,x30,[sp, #0x10]
009ce08c	ldp x20,x19,[sp], #0x20
009ce090	ret
