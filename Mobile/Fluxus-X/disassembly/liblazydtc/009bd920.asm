; FUN_009bd920 @ 009bd920
009bd920	stp x22,x21,[sp, #-0x30]!
009bd924	stp x20,x19,[sp, #0x10]
009bd928	mov x19,x2
009bd92c	mov x20,x1
009bd930	mov x21,x0
009bd934	mov w22,wzr
009bd938	stp x29,x30,[sp, #0x20]
009bd93c	add x29,sp,#0x20
009bd940	ldr x8,[x21, #0x9a8]
009bd944	ldr w2,[x19]
009bd948	mov x1,x20
009bd94c	mov w3,wzr
009bd950	ldr x0,[x8]
009bd954	bl 0x00c347b0
009bd958	cmp w0,#0x1
009bd95c	b.lt 0x009bd98c
009bd960	ldr w2,[x19]
009bd964	mov x0,x21
009bd968	mov x1,x20
009bd96c	bl 0x00c35a50
009bd970	cbz w0,0x009bd980
009bd974	add w22,w22,#0x1
009bd978	cmp w22,#0xa
009bd97c	b.cc 0x009bd940
009bd980	cmp w22,#0xa
009bd984	cset w0,cc
009bd988	b 0x009bd990
009bd98c	mov w0,wzr
009bd990	ldp x29,x30,[sp, #0x20]
009bd994	ldp x20,x19,[sp, #0x10]
009bd998	ldp x22,x21,[sp], #0x30
009bd99c	ret
