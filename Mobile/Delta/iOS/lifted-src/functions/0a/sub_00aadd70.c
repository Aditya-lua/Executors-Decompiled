/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaadd70..0xaadf04 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aadd70_1 {
    char padding_0[128];
    struct st_aadd70_1 *field_80;
} st_aadd70_1;

typedef struct st_aadd70_0 {
    char padding_0[8];
    long long field_8;
} st_aadd70_0;


st_aadd70_1 * sub_aadd70(long long a0, st_aadd70_0 *a1, unsigned long long a2)
{
    long long v6;  // x0
    st_aadd70_1 *v7;  // x0
    st_aadd70_1 *v8;  // x19
    long long v9;  // x0
    long long v10;  // x0
    long long v11;  // x0
    long long v12;  // x0
    st_aadd70_1 *v13;  // x0
    st_aadd70_1 *v14;  // x0
    st_aadd70_1 *v0;  // [bp-0x6c]
    st_aadd70_1 *v1;  // [bp-0x68]
    st_aadd70_1 *v2;  // [bp-0x60]
    st_aadd70_1 *v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_a5ed4c(a1);
    v7 = sub_ab1354(a1->field_8);
    v1 = 0;
    v2 = 0;
    v3 = (st_aadd70_1 *)0;
    v0 = (st_aadd70_1 *)0;
    if (!v7)
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_ameth.c", 862, "rsa_int_import_from");
        sub_a36abc(5, 0x80004, 0);
        return 0;
    }
    v8 = v7;
    sub_ab1ca0();
    sub_ab1cbc(v8, a2);
    if (sub_aae9d0(&v1, &v0, a0, a1->field_8))
    {
        if ((unsigned int)a2 != 0x1000)
        {
            if (!(unsigned int)a2 && sub_ab8c18(&v1))
                goto LABEL_aadea0;
        }
        else
        {
            if (!sub_ab8c18(&v1))
            {
                v9 = sub_ab8ca8(&v1);
                v10 = sub_ab8cd0(&v1);
                v11 = sub_ab8ce4(&v1);
                v12 = sub_a58d60(sub_a9976c(v9));
                v13 = sub_aac648(v12, sub_a58d60(sub_a9976c(v10)), v11);
                v8->field_80 = v13;
                if (v13)
                    goto LABEL_aadea0;
            }
            else
            {
LABEL_aadea0:
                if (sub_aae01c(v8, a0, 1))
                {
                    if (!(unsigned int)a2)
                    {
                        goto LABEL_aadecc;
                    }
                    else if ((unsigned int)a2 == 0x1000)
                    {
LABEL_aadecc:
                        v14 = sub_a5ab14(v6);
                        if ((unsigned int)v14)
                            return v14;
                    }
                }
            }
        }
    }
    sub_ab1360(v8);
    return 0;
}
