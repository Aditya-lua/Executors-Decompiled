; ossl_statem_client_pre_work @ 009db880
009db880	ldr w8,[x0, #0x5c]
009db884	sub w8,w8,#0x1
009db888	cmp w8,#0x2e
009db88c	b.hi 0x009db8fc
009db890	adrp x9,0x74d000
009db894	add x9,x9,#0x360
009db898	ldrsw x8,[x9, x8, LSL #0x2]
009db89c	add x8,x8,x9
009db8a0	br x8
009db8a4	mov w2,#0x1
009db8a8	mov w3,#0x1
009db8ac	b 0x00c371e0
009db8b0	ldr x8,[x0, #0x8]
009db8b4	str wzr,[x0, #0x44]
009db8b8	ldr x8,[x8, #0xc0]
009db8bc	ldrb w8,[x8, #0x60]
009db8c0	tbz w8,#0x3,0x009db8fc
009db8c4	stp x29,x30,[sp, #-0x10]!
009db8c8	mov x29,sp
009db8cc	bl 0x00c345d0
009db8d0	ldp x29,x30,[sp], #0x10
009db8d4	cbnz w0,0x009db8fc
009db8d8	mov w0,wzr
009db8dc	ret
009db8e0	ldr x8,[x0, #0x8]
009db8e4	ldr x8,[x8, #0xc0]
009db8e8	ldrb w8,[x8, #0x60]
009db8ec	tbz w8,#0x3,0x009db8fc
009db8f0	ldr w8,[x0, #0x4d0]
009db8f4	cbz w8,0x009db8fc
009db8f8	str wzr,[x0, #0x78]
009db8fc	mov w8,#0x2
009db900	mov w0,w8
009db904	ret
009db908	ldr w9,[x0, #0x84]
009db90c	mov w8,#0x2
009db910	cbz w9,0x009db900
009db914	cmp w9,#0x7
009db918	b.eq 0x009db900
009db91c	mov w3,#0x1
009db920	mov w2,wzr
009db924	b 0x00c371e0
