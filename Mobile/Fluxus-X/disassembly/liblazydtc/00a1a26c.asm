; ossl_dh_check_pub_key_partial @ 00a1a26c
00a1a26c	str x19,[sp, #-0x20]!
00a1a270	add x0,x0,#0x8
00a1a274	stp x29,x30,[sp, #0x10]
00a1a278	add x29,sp,#0x10
00a1a27c	mov x19,x2
00a1a280	bl 0x00c39e80
00a1a284	cbz w0,0x00a1a294
00a1a288	ldr w8,[x19]
00a1a28c	cmp w8,#0x0
00a1a290	cset w0,eq
00a1a294	ldp x29,x30,[sp, #0x10]
00a1a298	ldr x19,[sp], #0x20
00a1a29c	ret
