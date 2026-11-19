; mbedtls_des_key_check_key_parity @ 00b74788
00b74788	ldrb w9,[x0]
00b7478c	adrp x8,0x77e000
00b74790	add x8,x8,#0x7c0
00b74794	lsr w10,w9,#0x1
00b74798	ldrb w10,[x8, w10, UXTW ]
00b7479c	cmp w9,w10
00b747a0	b.ne 0x00b74834
00b747a4	ldrb w9,[x0, #0x1]
00b747a8	lsr w10,w9,#0x1
00b747ac	ldrb w10,[x8, w10, UXTW ]
00b747b0	cmp w9,w10
00b747b4	b.ne 0x00b74834
00b747b8	ldrb w9,[x0, #0x2]
00b747bc	lsr w10,w9,#0x1
00b747c0	ldrb w10,[x8, w10, UXTW ]
00b747c4	cmp w9,w10
00b747c8	b.ne 0x00b74834
00b747cc	ldrb w9,[x0, #0x3]
00b747d0	lsr w10,w9,#0x1
00b747d4	ldrb w10,[x8, w10, UXTW ]
00b747d8	cmp w9,w10
00b747dc	b.ne 0x00b74834
00b747e0	ldrb w9,[x0, #0x4]
00b747e4	lsr w10,w9,#0x1
00b747e8	ldrb w10,[x8, w10, UXTW ]
00b747ec	cmp w9,w10
00b747f0	b.ne 0x00b74834
00b747f4	ldrb w9,[x0, #0x5]
00b747f8	lsr w10,w9,#0x1
00b747fc	ldrb w10,[x8, w10, UXTW ]
00b74800	cmp w9,w10
00b74804	b.ne 0x00b74834
00b74808	ldrb w9,[x0, #0x6]
00b7480c	lsr w10,w9,#0x1
00b74810	ldrb w10,[x8, w10, UXTW ]
00b74814	cmp w9,w10
00b74818	b.ne 0x00b74834
00b7481c	ldrb w9,[x0, #0x7]
00b74820	lsr w10,w9,#0x1
00b74824	ldrb w8,[x8, w10, UXTW ]
00b74828	cmp w9,w8
00b7482c	cset w0,ne
00b74830	ret
00b74834	mov w0,#0x1
00b74838	ret
