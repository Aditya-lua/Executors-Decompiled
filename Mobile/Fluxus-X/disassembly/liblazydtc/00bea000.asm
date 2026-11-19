; std::__ndk1::time_get<char,std::__ndk1::istreambuf_iterator<char,std::__ndk1::char_traits<char>>>::__get_second @ 00bea000
00bea000	paciasp
00bea004	stp x29,x30,[sp, #-0x20]!
00bea008	stp x20,x19,[sp, #0x10]
00bea00c	mov x29,sp
00bea010	mov x19,x4
00bea014	mov x0,x2
00bea018	mov x20,x1
00bea01c	mov x1,x3
00bea020	mov x2,x4
00bea024	mov x3,x5
00bea028	mov w4,#0x2
00bea02c	bl 0x00bea2fc
00bea030	ldr w8,[x19]
00bea034	cmp w0,#0x3c
00bea038	b.gt 0x00bea048
00bea03c	tbnz w8,#0x2,0x00bea048
00bea040	str w0,[x20]
00bea044	b 0x00bea050
00bea048	orr w8,w8,#0x4
00bea04c	str w8,[x19]
00bea050	ldp x20,x19,[sp, #0x10]
00bea054	ldp x29,x30,[sp], #0x20
00bea058	autiasp
00bea05c	ret
