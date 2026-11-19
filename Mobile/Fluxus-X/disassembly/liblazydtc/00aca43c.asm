; FUN_00aca43c @ 00aca43c
00aca43c	stp x20,x19,[sp, #-0x20]!
00aca440	mov x19,x0
00aca444	mov x0,xzr
00aca448	stp x29,x30,[sp, #0x10]
00aca44c	add x29,sp,#0x10
00aca450	mov w20,w1
00aca454	bl 0x00c3f920
00aca458	cmp w20,#0x1
00aca45c	b.lt 0x00aca484
00aca460	cbz x0,0x00aca484
00aca464	ldp x29,x30,[sp, #0x10]
00aca468	sxtw x5,w20
00aca46c	mov w1,wzr
00aca470	mov x2,xzr
00aca474	mov x3,xzr
00aca478	mov x4,x19
00aca47c	ldp x20,x19,[sp], #0x20
00aca480	b 0x00c3d1c0
00aca484	ldp x29,x30,[sp, #0x10]
00aca488	mov w0,wzr
00aca48c	ldp x20,x19,[sp], #0x20
00aca490	ret
