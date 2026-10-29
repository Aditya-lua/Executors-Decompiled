/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b6a84..0x9b6ba8 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b6a84_0 {
    struct st_9b6a84_1 *field_0;
    unsigned long long field_8;
} st_9b6a84_0;

typedef struct st_9b6a84_2 {
    char padding_0[2816];
    long long field_b00;
    unsigned long long field_b08;
} st_9b6a84_2;

typedef struct st_9b6a84_1 {
    char field_0;
} st_9b6a84_1;


int sub_9b6a84(st_9b6a84_2 *a0, st_9b6a84_0 *a1)
{
    unsigned long v2;  // x20
    unsigned long v3;  // x9
    long long v12;  // x1
    long long v13;  // x2
    char *v4;  // x21
    char *v5;  // x8
    unsigned long v6;  // x9
    unsigned long v7;  // x10
    unsigned long v8;  // x9
    unsigned long long v9;  // 4117
    unsigned long v10;  // x0
    st_9b6a84_2 *v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1->field_8 && !(v2 = *(char *)a1->field_0, v3 = a1->field_8 - 1, v3 < v2))
    {
        v4 = a1->field_0 + 1;
        v5 = &v4[v2];
        v6 = v3 - v2;
        a1->field_0 = v5;
        a1->field_8 = v6;
        if (v3 == v2 || (v7 = *v5, v8 = v6 - 1, v8 < v7 || (a1->field_0 = &v5[v7 + 1], a1->field_8 = v8 - v7, v9 = arm64g_calculate_condition(20, v8, v7, 0), v9 & 1)))
            goto LABEL_9b6b30;
        sub_a6c2e4(a0->field_b00, "include/internal/packet.h", 454);
        a0->field_b00 = 0;
        if (!(unsigned int)v2 || !(v10 = sub_a6dac4(v4, v2, "include/internal/packet.h", 463), a0->field_b00 = v10, !v10))
        {
            a0->field_b08 = v2;
            return 3;
        }
        a0->field_b08 = 0;
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 0x113b, "tls_process_next_proto");
        v11 = a0;
        v12 = 80;
        v13 = 786691;
    }
    else
    {
LABEL_9b6b30:
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 0x1135, "tls_process_next_proto");
        v11 = a0;
        v12 = 50;
        v13 = 159;
    }
    sub_9a58a4(v11, v12, v13, 0);
    return 0;
}
