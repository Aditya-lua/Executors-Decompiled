/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1615c..0x166ec (1424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1615c_2 {
    unsigned long long field_0;
    unsigned long long *field_8;
    char padding_10[224];
    unsigned long long field_f0;
    unsigned long long field_f8;
} st_1615c_2;

typedef struct st_1615c_1 {
    struct st_1615c_0 *field_0;
} st_1615c_1;

typedef struct st_1615c_0 {
    char field_0;
} st_1615c_0;

extern unsigned long long g_e62ac8;
extern unsigned long long g_e62b30;
extern unsigned int g_f0c970;

void sub_1615c(void* a0, unsigned long long a1, uint128_t *a2)
{
    unsigned long long v32;  // x28
    unsigned long long v33;  // x27
    unsigned long long v42;  // x30
    unsigned long long v43;  // x22
    int v44;  // w8
    unsigned long long v34;  // x26
    unsigned long long v35;  // x25
    unsigned long long v36;  // x24
    unsigned long long v37;  // x23
    unsigned long long v38;  // x22
    unsigned long long v39;  // x21
    unsigned long long v40;  // x20
    unsigned long long v41;  // x19
    uint128_t *v0;  // [bp-0x128]
    st_1615c_0 **v1;  // [bp-0x120], Other Possible Types: char
    st_1615c_0 *v2;  // [bp-0x118]
    uint128_t v3;  // [bp-0x110], Other Possible Types: st_1615c_0 *, st_1615c_1 **
    unsigned long v4;  // [bp-0xf8]
    st_1615c_0 **v5;  // [bp-0xf0], Other Possible Types: char
    unsigned long long v6;  // [bp-0xe8]
    unsigned long v7;  // [bp-0xd8]
    st_1615c_0 *v8;  // [bp-0xd0], Other Possible Types: uint128_t
    unsigned long v9;  // [bp-0xb8]
    unsigned long long *v10;  // [bp-0xb0]
    long long v11;  // [bp-0xa8]
    unsigned long long node;  // [bp-0xa0]
    st_1615c_2 *v13;  // [bp-0x98]
    long long v14;  // [bp-0x90]
    unsigned long long iter;  // [bp-0x88]
    unsigned long long v16;  // [bp-0x80]
    st_1615c_0 *v17;  // [bp-0x78]
    st_1615c_0 **v18;  // [bp-0x70], Other Possible Types: char
    unsigned long long v19;  // [bp-0x60]
    unsigned long long v20;  // [bp-0x58]
    unsigned long long v21;  // [bp-0x50]
    unsigned long long v22;  // [bp-0x48]
    unsigned long long v23;  // [bp-0x40]
    unsigned long long v24;  // [bp-0x38]
    unsigned long long v25;  // [bp-0x30]
    unsigned long long v26;  // [bp-0x28]
    unsigned long long v27;  // [bp-0x20]
    unsigned long long v28;  // [bp-0x18]
    char *v29;  // [bp-0x10]
    unsigned long long v30;  // [bp-0x8]
    char v31;  // [bp+0x0]

    v19 = v32;
    v20 = v33;
    v21 = v34;
    v22 = v35;
    v23 = v36;
    v24 = v37;
    v25 = v38;
    v26 = v39;
    v27 = v40;
    v28 = v41;
    v29 = &v31;
    v30 = v42;
    v2 = &v1;
    v1 = &v2;
    iter = 0;
    v16 = a1;
    v13 = a0 + 848;
    v14 = (long long)a0[856] - (long long)a0[848] >> 3;
    v10 = a0 + 1088;
    v11 = (long long)a0[1096] - (long long)a0[1088] >> 3;
    node = 0;
    v9 = 0xffffffffffffffff;
    if (a1)
    {
        v8 = &v5;
        v5 = &v8;
        sub_103a8(v13, &v16);
        iter += 1;
    }
    sub_16844(a0, "type annotation");
    v43 = 0;
    v0 = a2;
    v8 = *a2;
    v44 = (int)a0[128];
    v7 = (long long)a0[132];
    if (123 >= v44)
    {
        switch (v44)
        {
        case 38:
            sub_f8d0(a0);
            v5 = sub_15068(a0, 0, 0);
            v6 = 0;
            v3 = &v18;
            v18 = &v3;
            sub_103a8(v13, &v5);
            iter += 1;
            *(int *)&a0[276] = (int)a0[276];
            if ((char)a0[88] == 1)
            {
                if (v16 || sub_1e428(&v9) & 1)
                {
                    v5 = &v3;
                    v3 = &v5;
                    sub_f2b8(v10, &v7);
                    node += 1;
                }
                else
                {
                    v9 = v7;
                }
            }
            break;
        case 63:
            v5 = (int128_t)a0[132];
            sub_f8d0(a0);
            v3 = v5;
            v4 = sub_7128(sub_404c((long long)a0[216], 32), &v3);
            v17 = &v18;
            v18 = &v17;
            sub_103a8(v13, &v4);
            iter += 1;
            v43 = 1;
            goto LABEL_16360;
        default:
            goto *((void *)(g_e62b30));
        }
    }
    else
    {
        switch (v44)
        {
        case 262:
            sub_1db64(a0, a0 + 132, "Unexpected '...' after type annotation");
            sub_f8d0(a0);
        case 124:
            sub_f8d0(a0);
            v5 = sub_15068(a0, 0, 0);
            v6 = 0;
            v3 = &v18;
            v18 = &v3;
            sub_103a8(v13, &v5);
            iter += 1;
            *(int *)&a0[276] = (int)a0[276];
            if ((char)a0[88] == 1)
            {
                if (v16 || sub_1e428(&v9) & 1)
                {
                    v5 = &v3;
                    v3 = &v5;
                    sub_f2b8(v10, &v7);
                    node += 1;
                }
                else
                {
                    v9 = v7;
                }
            }
LABEL_16360:
            break;
        default:
            goto *((void *)(g_e62b30));
        }
    }
    if (g_f0c970 + v43 < iter)
    {
        sub_24dec(*(long long *)((char *)v13->field_8 - 8) + 12, "Exceeded allowed type length; simplify your type annotation to make the code compile");
        __debugbreak();
    }
    goto *((void *)(g_e62ac8));
}
