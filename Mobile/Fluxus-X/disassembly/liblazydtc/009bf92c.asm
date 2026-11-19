; SSL_alert_desc_string_long @ 009bf92c
009bf92c	and w8,w0,#0xff
009bf930	cmp w8,#0x78
009bf934	b.hi 0x009bf964
009bf938	adrp x9,0x74c000
009bf93c	and x8,x0,#0xff
009bf940	add x9,x9,#0x83c
009bf944	ldrsw x8,[x9, x8, LSL #0x2]
009bf948	adrp x0,0x2cd000
009bf94c	add x0,x0,#0x6b6
009bf950	add x8,x8,x9
009bf954	br x8
009bf958	adrp x0,0x2a1000
009bf95c	add x0,x0,#0xfdf
009bf960	ret
009bf964	adrp x0,0x2ab000
009bf968	add x0,x0,#0x4b6
009bf96c	ret
009bf970	adrp x0,0x2db000
009bf974	add x0,x0,#0xbb0
009bf978	ret
009bf97c	adrp x0,0x2b3000
009bf980	add x0,x0,#0xcac
009bf984	ret
009bf988	adrp x0,0x29f000
009bf98c	add x0,x0,#0xe2c
009bf990	ret
009bf994	adrp x0,0x2bf000
009bf998	add x0,x0,#0x8ff
009bf99c	ret
009bf9a0	adrp x0,0x2a3000
009bf9a4	add x0,x0,#0xc78
009bf9a8	ret
009bf9ac	adrp x0,0x2cd000
009bf9b0	add x0,x0,#0x6c3
009bf9b4	ret
009bf9b8	adrp x0,0x2a1000
009bf9bc	add x0,x0,#0xff2
009bf9c0	ret
009bf9c4	adrp x0,0x29d000
009bf9c8	add x0,x0,#0xe08
009bf9cc	ret
009bf9d0	adrp x0,0x2bf000
009bf9d4	add x0,x0,#0x915
009bf9d8	ret
009bf9dc	adrp x0,0x2a2000
009bf9e0	add x0,x0,#0x2
009bf9e4	ret
009bf9e8	adrp x0,0x2b3000
009bf9ec	add x0,x0,#0xe74
009bf9f0	ret
009bf9f4	adrp x0,0x2d1000
009bf9f8	add x0,x0,#0x642
009bf9fc	ret
009bfa00	adrp x0,0x2cb000
009bfa04	add x0,x0,#0x592
009bfa08	ret
009bfa0c	adrp x0,0x2b9000
009bfa10	add x0,x0,#0x999
009bfa14	ret
009bfa18	adrp x0,0x2b9000
009bfa1c	add x0,x0,#0x9a7
009bfa20	ret
009bfa24	adrp x0,0x2a9000
009bfa28	add x0,x0,#0xe86
009bfa2c	ret
009bfa30	adrp x0,0x2c7000
009bfa34	add x0,x0,#0x696
009bfa38	ret
009bfa3c	adrp x0,0x2c3000
009bfa40	add x0,x0,#0x5c2
009bfa44	ret
009bfa48	adrp x0,0x29f000
009bfa4c	add x0,x0,#0xccf
009bfa50	ret
009bfa54	adrp x0,0x2d7000
009bfa58	add x0,x0,#0xa3d
009bfa5c	ret
009bfa60	adrp x0,0x2db000
009bfa64	add x0,x0,#0xbbf
009bfa68	ret
009bfa6c	adrp x0,0x2c3000
009bfa70	add x0,x0,#0x4cd
009bfa74	ret
009bfa78	adrp x0,0x2c1000
009bfa7c	add x0,x0,#0x7ad
009bfa80	ret
009bfa84	adrp x0,0x2b7000
009bfa88	add x0,x0,#0x79a
009bfa8c	ret
009bfa90	adrp x0,0x2c1000
009bfa94	add x0,x0,#0x7c3
009bfa98	ret
009bfa9c	adrp x0,0x2d3000
009bfaa0	add x0,x0,#0x78d
009bfaa4	ret
009bfaa8	adrp x0,0x2d5000
009bfaac	add x0,x0,#0x90f
009bfab0	ret
009bfab4	adrp x0,0x2d3000
009bfab8	add x0,x0,#0x7ad
009bfabc	ret
009bfac0	adrp x0,0x2b1000
009bfac4	add x0,x0,#0xdee
009bfac8	ret
