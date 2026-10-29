/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d693c..0x9d6c80 (836 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d693c_0 {
    char padding_0[220];
    unsigned int field_dc;
    char padding_e0[16];
    unsigned long long field_f0;
} st_9d693c_0;

typedef struct st_9d693c_1 {
    char padding_0[56];
    unsigned int field_38;
    char padding_3c[4];
    struct st_9d693c_0 *field_40;
} st_9d693c_1;

extern char g_10002b0;

unsigned long long sub_9d693c(st_9d693c_1 *a0, unsigned long long a1, int a2)
{
    unsigned long long count;  // x20
    st_9d693c_0 *v9;  // x25
    long long v18;  // x0
    unsigned long long v19;  // 4112
    unsigned int v20;  // w8
    st_9d693c_0 *v21;  // x8
    unsigned long v22;  // x8
    unsigned long long v23;  // 4113
    unsigned int *v24;  // x0
    st_9d693c_0 *v10;  // x22
    unsigned long long v11;  // x8
    unsigned int *v12;  // x0
    unsigned long long v13;  // x0
    unsigned long long v14;  // x9
    unsigned long long v15;  // x8
    unsigned long long v16;  // 4109
    unsigned int *v17;  // x0
    unsigned int v0;  // [bp-0xe0]
    unsigned int v1;  // [bp-0xdc]
    char v2;  // [bp-0xd8], Other Possible Types: unsigned long long
    int v3;  // [bp-0xd0], Other Possible Types: unsigned long
    char v4;  // [bp-0xc4]
    unsigned long v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    count = a1;
    v5 = *(long long *)&g_10002b0;
    v9 = a0->field_40;
    v0 = 108;
    if (a1)
    {
        *(unsigned int *)___error() = 0;
        sub_9d353c(&v4);
        v10 = a0->field_40;
        if (*(long long *)&v10->padding_e0[8])
        {
            v1 = 16;
            if (!(_getsockopt(a0->field_38, 0xffff, 0x1006, &v2, &v1) >> 31 & 1))
            {
                if (v2 >= 0)
                    v11 = 1000000000 * v2 + v3 * 1000;
                else
                    v11 = 0;
                v10->field_f0 = v11;
            }
            else
            {
                sub_a368c8();
                v12 = ___error(sub_a369bc("crypto/bio/bss_dgram.c", 337, "dgram_adjust_rcv_timeout"), 337, "dgram_adjust_rcv_timeout");
                sub_a36abc(2, *v12, "calling getsockopt()");
            }
            v13 = sub_a7c2c0();
            v14 = *(long long *)&v10->padding_e0[8] - v13;
            if ((unsigned long long)*(long long *)&v10->padding_e0[8] < v13)
                v14 = 0;
            if (1000 >= v14)
                v14 = 1000;
            if (!v10->field_f0 || v10->field_f0 >= v14)
            {
                v15 = v14 + 999;
                v16 = arm64g_calculate_condition(50, v14, 999, 0);
                if (!(v16 & 1))
                    v15 = 0xffffffffffffffff;
                v2 = (v15 >> 9) / 1953125;
                v3 = ((unsigned int)v15 - 1000000000 * (unsigned int)v2) / 1000;
                if (_setsockopt() >> 31 & 1)
                {
                    sub_a368c8();
                    v17 = ___error(sub_a369bc("crypto/bio/bss_dgram.c", 366, "dgram_adjust_rcv_timeout"), 366, "dgram_adjust_rcv_timeout");
                    sub_a36abc(2, *v17, "calling setsockopt()");
                }
            }
        }
        v18 = sub_c044(&v4);
        count = _recvfrom(a0->field_38, count, a2, (*(int *)&v9[1].padding_0[0] != 0) * 2, v18, &v0);
        if (!*(int *)&v9->padding_0[216] && !(count >> 31 & 1))
        {
            sub_9d46fc(a0, 44, 0, &v4);
            sub_9d3d58(a0, 15);
        }
        else
        {
            sub_9d3d58(a0, 15);
            v19 = arm64g_calculate_condition(0x11, count & 0xffffffff, 1, 0);
            if (!(v19 & 1))
            {
                v20 = *(int *)___error();
                if (37 >= v20 && 1 << ((char)v20 & 63) & 240518168592 || v20 == 100)
                    v9->field_dc = *(int *)___error(sub_9d3d74(a0, 9), 9);
            }
        }
        v21 = a0->field_40;
        if (*(long long *)&v21->padding_e0[8])
        {
            v22 = v21->field_f0 + 999;
            v23 = arm64g_calculate_condition(50, v21->field_f0, 999, 0);
            if (!(v23 & 1))
                v22 = 0xffffffffffffffff;
            v2 = (v22 >> 9) / 1953125;
            v3 = ((unsigned int)v22 - 1000000000 * (unsigned int)v2) / 1000;
            if (_setsockopt() >> 31 & 1)
            {
                sub_a368c8();
                v24 = ___error(sub_a369bc("crypto/bio/bss_dgram.c", 414, "dgram_reset_rcv_timeout"), 414, "dgram_reset_rcv_timeout");
                sub_a36abc(2, *v24, "calling setsockopt()");
            }
        }
    }
    if (*(long long *)&g_10002b0 == v5)
        return count;
    ___stack_chk_fail();
}
