/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fc824..0x9fc9fc (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fc824_0 {
    char padding_0[104];
    unsigned int field_68;
} st_9fc824_0;


unsigned long long sub_9fc824(long long a0, st_9fc824_0 *a1, unsigned long long a2, int a3)
{
    unsigned long v4;  // cc_dep1
    unsigned long v5;  // cc_dep2
    unsigned long long v14;  // x8
    long long v15;  // x19
    unsigned long long v16;  // x8
    unsigned long long v6;  // x23
    unsigned long long v7;  // x24
    unsigned long long v8;  // w8
    unsigned long v9;  // 4110
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // 4110
    unsigned long long v13;  // 4121
    unsigned long v0;  // [bp-0x60], Other Possible Types: unsigned long long
    unsigned long long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a3;
    v5 = 2;
    if (a3 == 2)
    {
        v6 = *(long long *)&a1[1].padding_0[12];
LABEL_9fc86c:
        v7 = *(long long *)&a1[1].padding_0[4];
        v8 = 1;
    }
    else
    {
        v6 = 0;
        v4 = a3;
        v5 = 1;
        if (a3 >= 1)
            goto LABEL_9fc86c;
        v8 = 0;
        v7 = 0;
    }
    if (a3 == 2)
    {
        v9 = arm64g_calculate_condition(3, v4, v5, 0);
        v10 = 4;
        v11 = (v9 & 1 ? v6 : 0);
    }
    else
    {
        v12 = arm64g_calculate_condition(3, v4, v5, 0);
        v10 = 0;
        v11 = (v12 & 1 ? v6 : 0);
    }
    v13 = arm64g_calculate_condition(v10 | 16, v11, 0, 0);
    if (v7)
        v14 = 0;
    else
        v14 = v8;
    v15 = 786690;
    if (*(long long *)&a1->padding_0[8] && v13 & 1 && !(v14 & 1))
    {
        v15 = 524295;
        if (sub_9d4cf4(a0, a2, 128))
        {
            v16 = "DH Parameters";
            if (a3 == 1)
                v16 = "DH Public-Key";
            if (a3 == 2)
                v16 = "DH Private-Key";
            v0 = v16;
            v1 = sub_9ffc20();
            if ((int)sub_9d524c(a0, "%s: (%d bit)\n") >= 1 && sub_9cab08(a0, "private-key:", v6, 0, (unsigned int)a2 + 4) && sub_9cab08(a0, "public-key:", v7, 0, (unsigned int)a2 + 4) && sub_a61364(a0, &a1->padding_0[8], (unsigned int)a2 + 4) && (!a1->field_68 || sub_9d4cf4(a0, (unsigned int)a2 + 4, 128) && (v0 = a1->field_68, (int)sub_9d524c(a0, "recommended-private-length: %d bits\n") > 0)))
                return 1;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/dh/dh_ameth.c", 297, "do_dh_print");
    sub_a36abc(5, v15, 0);
    return 0;
}
