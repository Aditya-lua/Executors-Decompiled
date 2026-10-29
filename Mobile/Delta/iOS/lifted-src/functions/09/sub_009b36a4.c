/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b36a4..0x9b3920 (636 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b36a4_1 {
    int field_0;
    char padding_4[172];
    struct st_9b36a4_2 *field_b0;
    char padding_b8[32];
    struct st_9b36a4_0 *field_d8;
} st_9b36a4_1;

typedef struct st_9b36a4_4 {
    char padding_0[8];
    struct st_9b36a4_0 *field_8;
    char padding_10[8];
    struct st_9b36a4_1 *field_18;
    char padding_20[1256];
    unsigned int field_508;
    char padding_50c[1012];
    struct st_9b36a4_3 *field_900;
    char padding_908[64];
    unsigned long long field_948;
} st_9b36a4_4;

typedef struct st_9b36a4_3 {
    char padding_0[592];
    unsigned long long field_250;
} st_9b36a4_3;

typedef struct st_9b36a4_0 {
    char padding_0[80];
    char field_50;
} st_9b36a4_0;

typedef struct st_9b36a4_2 {
    unsigned long long field_0;
} st_9b36a4_2;


char sub_9b36a4(st_9b36a4_4 *a0, long long a1)
{
    char v2;  // w21
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000 || *(int *)&a0->padding_50c[964] == 1)
        v2 = 1;
    else
        v2 = 0;
    if (sub_c68d5c(a1))
    {
        if (!sub_a6ebd4())
            goto LABEL_9b376c;
        if (a0->field_8->field_50 >> 1 & 1 || a0->field_508)
        {
            if (!v2)
                goto LABEL_9b3794;
LABEL_9b3754:
            if (32 >= a0->field_948)
                goto LABEL_9b37d8;
LABEL_9b37a4:
            sub_a368c8();
            v3 = 2497;
        }
        else
        {
            a0->field_900->field_250 = 0;
            if (v2)
                goto LABEL_9b3754;
LABEL_9b3794:
            if (a0->field_900->field_250 >= 33)
                goto LABEL_9b37a4;
LABEL_9b37d8:
            if (sub_a6ec4c(a1))
                a0->field_18->field_b0();
            sub_a368c8();
            v3 = 2515;
        }
    }
    else
    {
LABEL_9b376c:
        sub_a368c8();
        v3 = 2462;
    }
    sub_a369bc("ssl/statem/statem_srvr.c", v3, "tls_construct_server_hello");
    sub_9a58a4(a0, 80, 0xc0103, 0);
    return 0;
}
