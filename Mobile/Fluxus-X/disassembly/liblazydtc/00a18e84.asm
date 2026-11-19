; bn_copy_words @ 00a18e84
00a18e84	stp x20,x19,[sp, #-0x20]!
00a18e88	stp x29,x30,[sp, #0x10]
00a18e8c	ldr w8,[x1, #0x8]
00a18e90	mov x19,x0
00a18e94	mov w0,wzr
00a18e98	add x29,sp,#0x10
00a18e9c	cmp w8,w2
00a18ea0	b.gt 0x00a18ed4
00a18ea4	mov x20,x1
00a18ea8	sbfiz x2,x2,#0x3,#0x20
00a18eac	mov x0,x19
00a18eb0	mov w1,wzr
00a18eb4	bl 0x00c301c0
00a18eb8	ldr x1,[x20]
00a18ebc	cbz x1,0x00a18ed0
00a18ec0	ldrsw x8,[x20, #0x8]
00a18ec4	mov x0,x19
00a18ec8	lsl x2,x8,#0x3
00a18ecc	bl 0x00c2ffd0
00a18ed0	mov w0,#0x1
00a18ed4	ldp x29,x30,[sp, #0x10]
00a18ed8	ldp x20,x19,[sp], #0x20
00a18edc	ret
