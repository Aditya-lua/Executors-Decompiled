; FUN_008ad70c @ 008ad70c
008ad70c	stp x29,x30,[sp, #-0x20]!
008ad710	stp x20,x19,[sp, #0x10]
008ad714	mov x29,sp
008ad718	cmp w1,#0x1
008ad71c	mov x19,x0
008ad720	b.lt 0x008ad75c
008ad724	ldp x9,x8,[x19, #0x68]
008ad728	add x8,x8,w1, UXTW  #0x4
008ad72c	sub x1,x8,#0x10
008ad730	cmp x1,x9
008ad734	b.cc 0x008ad780
008ad738	adrp x8,0xd1f000
008ad73c	add x8,x8,#0x1e0
008ad740	ldarb w9,[x8]
008ad744	adrp x8,0xd1f000
008ad748	tbz w9,#0x0,0x008ad7ac
008ad74c	ldr x8,[x8, #0x1d8]
008ad750	add x8,x8,#0x7f2, LSL #12
008ad754	add x1,x8,#0xef0
008ad758	b 0x008ad780
008ad75c	mov w8,#0xffffd8f1
008ad760	cmp w1,w8
008ad764	b.lt 0x008ad774
008ad768	ldr x8,[x19, #0x68]
008ad76c	add x1,x8,w1, SXTW  #0x4
008ad770	b 0x008ad780
008ad774	mov x0,x19
008ad778	bl 0x008aea7c
008ad77c	mov x1,x0
008ad780	ldr x8,[x19, #0x68]
008ad784	mov x0,x19
008ad788	sub x2,x8,#0x20
008ad78c	sub x3,x8,#0x10
008ad790	bl 0x008cb374
008ad794	ldr x8,[x19, #0x68]
008ad798	sub x8,x8,#0x20
008ad79c	str x8,[x19, #0x68]
008ad7a0	ldp x20,x19,[sp, #0x10]
008ad7a4	ldp x29,x30,[sp], #0x20
008ad7a8	ret
008ad7ac	adrp x0,0xd1f000
008ad7b0	add x0,x0,#0x1e0
008ad7b4	bl 0x00c2fe90
008ad7b8	adrp x8,0xd1f000
008ad7bc	cbz w0,0x008ad74c
008ad7c0	adrp x8,0xcca000
008ad7c4	ldr x0,[x8, #0x8c8]
008ad7c8	bl 0x007fe1ec
008ad7cc	adrp x20,0xd1f000
008ad7d0	str x0,[x20, #0x1d8]
008ad7d4	adrp x0,0xd1f000
008ad7d8	add x0,x0,#0x1e0
008ad7dc	bl 0x00c2fea0
008ad7e0	mov x8,x20
008ad7e4	b 0x008ad74c
