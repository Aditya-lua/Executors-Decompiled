; dtls1_record_replay_check @ 009ca568
009ca568	str x21,[sp, #-0x30]!
009ca56c	mov w8,#0x1cf8
009ca570	stp x20,x19,[sp, #0x10]
009ca574	add x19,x0,x8
009ca578	mov x21,x1
009ca57c	mov x20,x0
009ca580	add x1,x1,#0x8
009ca584	mov x0,x19
009ca588	stp x29,x30,[sp, #0x20]
009ca58c	add x29,sp,#0x20
009ca590	bl 0x009ca5f0
009ca594	cmp w0,#0x1
009ca598	b.lt 0x009ca5b4
009ca59c	mov w8,#0x12a8
009ca5a0	add x0,x20,x8
009ca5a4	mov x1,x19
009ca5a8	bl 0x00c36be0
009ca5ac	mov w0,#0x1
009ca5b0	b 0x009ca5e0
009ca5b4	neg w8,w0
009ca5b8	cmp w8,#0x3f
009ca5bc	mov w0,wzr
009ca5c0	b.hi 0x009ca5e0
009ca5c4	ldr x9,[x21]
009ca5c8	mov w8,w8
009ca5cc	mov w10,#0x1
009ca5d0	lsl x8,x10,x8
009ca5d4	tst x9,x8
009ca5d8	mov w0,wzr
009ca5dc	b.eq 0x009ca59c
009ca5e0	ldp x29,x30,[sp, #0x20]
009ca5e4	ldp x20,x19,[sp, #0x10]
009ca5e8	ldr x21,[sp], #0x30
009ca5ec	ret
