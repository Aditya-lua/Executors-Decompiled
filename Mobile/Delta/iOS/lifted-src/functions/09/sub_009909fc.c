/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9909fc..0x990bf4 (504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9909fc_0 {
    char padding_0[16];
    long long field_10;
    char padding_18[8];
    unsigned int field_20;
} st_9909fc_0;

typedef struct st_9909fc_1 {
    unsigned int field_0;
    char field_4;
} st_9909fc_1;

extern long long g_d286d2;
extern char g_10002b0;

int sub_9909fc(st_9909fc_0 *a0, long long a1, unsigned long a2, st_9909fc_1 *a3)
{
    long long v6;  // x1
    long long v8;  // x1
    long long v9;  // x1
    unsigned int v0;  // [bp-0x4c]
    char v1;  // [bp-0x48]
    char v2;  // [bp-0x44]
    unsigned long v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v0 = 0;
    if (2 <= a0->field_20 - 1)
    {
        if (a0->field_20 == 3)
        {
            if (15 >= a2)
            {
                sub_a368c8();
                v6 = 0x66;
LABEL_990a80:
                sub_a369bc("ssl/quic/quic_wire_pkt.c", v6, "hdr_generate_mask");
                v9 = 524550;
            }
            else
            {
                if (sub_a4c694(a0->field_10, 0, 0, 0, a1, 1) && sub_a4c6a0(a0->field_10, a3, &v0, &g_d286d2, 5))
                {
                    if (*(long long *)&g_10002b0 == v3)
                        return 1;
                    ___stack_chk_fail();
                }
                sub_a368c8();
                v8 = 109;
LABEL_990ba8:
                sub_a369bc("ssl/quic/quic_wire_pkt.c", v8, "hdr_generate_mask");
                v9 = 524294;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/quic/quic_wire_pkt.c", 113, "hdr_generate_mask");
            v9 = 786691;
        }
        sub_a36abc(20, v9, 0);
        if (*(long long *)&g_10002b0 == v3)
            return 0;
        ___stack_chk_fail();
    }
    else if (15 >= a2)
    {
        sub_a368c8();
        v6 = 88;
        goto LABEL_990a80;
    }
    else
    {
        if (sub_a4c694(a0->field_10, 0, 0, 0, 0, 1) && sub_a4c6a0(a0->field_10, &v1, &v0, a1, 16))
        {
            a3->field_0 = v1;
            a3->field_4 = v2;
            if (*(long long *)&g_10002b0 == v3)
                return 1;
            ___stack_chk_fail();
        }
        sub_a368c8();
        v8 = 94;
        goto LABEL_990ba8;
    }
}
