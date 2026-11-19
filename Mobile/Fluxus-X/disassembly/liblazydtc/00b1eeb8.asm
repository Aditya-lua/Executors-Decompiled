; X509_set0_distinguishing_id @ 00b1eeb8
00b1eeb8	stp x20,x19,[sp, #-0x20]!
00b1eebc	stp x29,x30,[sp, #0x10]
00b1eec0	mov x19,x0
00b1eec4	ldr x0,[x0, #0x168]
00b1eec8	add x29,sp,#0x10
00b1eecc	mov x20,x1
00b1eed0	bl 0x00c35530
00b1eed4	str x20,[x19, #0x168]
00b1eed8	ldp x29,x30,[sp, #0x10]
00b1eedc	ldp x20,x19,[sp], #0x20
00b1eee0	ret
